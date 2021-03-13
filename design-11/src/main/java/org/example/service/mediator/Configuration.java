package org.example.service.mediator;

import java.sql.Connection;
import java.util.Map;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/7
 * @since 1.0.0
 */
public class Configuration {

    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, Node> mapperElement;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Map<String, String> getDataSource() {
        return dataSource;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, Node> getMapperElement() {
        return mapperElement;
    }

    public void setMapperElement(Map<String, Node> mapperElement) {
        this.mapperElement = mapperElement;
    }
}
