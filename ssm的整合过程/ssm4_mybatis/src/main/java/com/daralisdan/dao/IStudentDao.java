package com.daralisdan.dao;

import org.apache.ibatis.annotations.Insert;
import com.daralisdan.pojo.Student;

public interface IStudentDao {
  
  @Insert("insert into students(name,age) value(#{name},#{age})")
  void insert(Student student);



}
