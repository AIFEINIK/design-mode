package org.example.service.dao;

import org.example.service.model.Person;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/7
 * @since 1.0.0
 */
public interface PersonDao {

    Person getPersonById(Integer id);
}
