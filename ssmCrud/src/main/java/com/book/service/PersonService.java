package com.book.service;

import java.util.List;

import com.book.pojo.Person;

public interface PersonService {
    /**
     * 加载全部的person
     * 
     * @return
     */
    public List<Person> loadPersons();

    /**
     * 增加记录
     * 
     * @param person
     */
    void insert(Person person);

    /**
     * 修改记录
     * @param person
     */
    void update(Person person);
    
    /**
     * 删除记录
     * @param id
     */
    void delete(int id);

}
