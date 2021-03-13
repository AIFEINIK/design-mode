package org.example.service.mediator;

import java.util.List;

/**
 * @author Feinik
 * @discription 定义数据库的基本查询接口
 * @date 2021/3/7
 * @since 1.0.0
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
