package org.example;

import org.apache.ibatis.io.Resources;
import org.example.service.mediator.SqlSession;
import org.example.service.mediator.SqlSessionFactory;
import org.example.service.mediator.SqlSessionFactoryBuilder;
import org.example.service.model.Person;
import org.junit.Test;

import java.io.Reader;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/7
 * @since 1.0.0
 */
public class JdbcUtil {

    @Test
    public void execute() throws Exception {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                Person person = session.selectOne("org.example.service.dao.PersonDao.getPersonById", 25);
                System.out.println(person);
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
