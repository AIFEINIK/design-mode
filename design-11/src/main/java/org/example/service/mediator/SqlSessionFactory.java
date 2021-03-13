package org.example.service.mediator;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/7
 * @since 1.0.0
 */
public interface SqlSessionFactory {

    SqlSession openSession();
}
