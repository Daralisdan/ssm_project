package com.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.book.pojo.Person;

public interface PersonMapper {

    /**
     * 插入一条记录
     * 
     * @param person
     */
    void insert(Person person);

    /**
     * 查询所有
     * 
     * @return
     */
    List<Person> queryAll();

    /**
     * 修改一条记录
     * 
     * @param person
     */
    void update(Person person);

    /**
     * 删除一条记录
     * 
     * @param id
     */
    void delete(@Param("id") int id);
    
    Person findById(@Param("id") int id);
}
