package org.example.service.mediator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/7
 * @since 1.0.0
 */
public class DefaultSqlSession implements SqlSession {

    private Connection connection;
    private Map<String, Node> xmlMapperElement;

    public DefaultSqlSession(Connection connection, Map<String, Node> xmlMapperElement) {
        this.connection = connection;
        this.xmlMapperElement = xmlMapperElement;
    }

    @Override
    public <T> T selectOne(String statement) {
        try {
            Node node = xmlMapperElement.get(statement);
            PreparedStatement preparedStatement = connection.prepareStatement(node.getSql());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<T> objs = transferResult(resultSet, Class.forName(node.getResultType()));
            return objs.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        try {
            Node node = xmlMapperElement.get(statement);
            PreparedStatement preparedStatement = connection.prepareStatement(node.getSql());
            buildParameter(preparedStatement, parameter, node.getParameter());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<T> objs = transferResult(resultSet, Class.forName(node.getResultType()));
            return objs.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> List<T> selectList(String statement) {
        try {
            Node node = xmlMapperElement.get(statement);
            PreparedStatement preparedStatement = connection.prepareStatement(node.getSql());
            ResultSet resultSet = preparedStatement.executeQuery();
            return transferResult(resultSet, Class.forName(node.getResultType()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> List<T> selectList(String statement, Object parameter) {
        try {
            Node node = xmlMapperElement.get(statement);
            PreparedStatement preparedStatement = connection.prepareStatement(node.getSql());
            buildParameter(preparedStatement, parameter, node.getParameter());
            ResultSet resultSet = preparedStatement.executeQuery();
            return transferResult(resultSet, Class.forName(node.getResultType()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void close() {
        if (null == connection) {
            return;
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private <T> List<T> transferResult(ResultSet resultSet, Class<?> type) {
        List<T> result = new ArrayList<>();
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                T obj = (T) type.newInstance();
                for (int i = 1; i <= columnCount; i++) {
                    Object value = resultSet.getObject(i);
                    String columnName = metaData.getColumnName(i);
                    String fieldMethod = "set" + columnName.substring(0, 1).toUpperCase() + columnName.substring(1);
                    Method method = type.getMethod(fieldMethod, value.getClass());
                    method.invoke(obj, value);
                }
                result.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private void buildParameter(PreparedStatement ps, Object parameter, Map<Integer, String> parameterMap) throws Exception {
        int size = parameterMap.size();
        if (parameter instanceof Long) {
            ps.setLong(1, Long.parseLong(parameter.toString()));
            return;
        }

        if (parameter instanceof Integer) {
            ps.setInt(1, Integer.valueOf(parameter.toString()));
            return;
        }

        if (parameter instanceof String) {
            ps.setString(1, parameter.toString());
            return;
        }

        Field[] fields = parameter.getClass().getDeclaredFields();
        Map<String, Object> valueMap = new HashMap<>();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            Object value = field.get(name);
            valueMap.put(name, value);
        }

        for (int i = 1; i <= size; i++) {
            String parameterDefine = parameterMap.get(i);
            Object obj = valueMap.get(parameterDefine);
            if (obj instanceof Short) {
                ps.setShort(i, Short.parseShort(obj.toString()));
                continue;
            }

            if (obj instanceof Integer) {
                ps.setInt(i, Integer.parseInt(obj.toString()));
                continue;
            }

            if (obj instanceof Long) {
                ps.setLong(i, Long.parseLong(obj.toString()));
                continue;
            }

            if (obj instanceof String) {
                ps.setString(i, obj.toString());
                continue;
            }

            if (obj instanceof Date) {
                ps.setDate(i, (java.sql.Date) obj);
            }
        }
    }
}
