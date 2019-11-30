package com.daralisdan.service;

import com.daralisdan.dao.IStudentDao;
import com.daralisdan.pojo.Student;

public class StudentServiceImp implements IStudentService {
  private IStudentDao dao;

  public void setDao(IStudentDao dao) {
    this.dao = dao;
  }

  @Override
  public void addStudent(Student student) {
    dao.insert(student);
  }

}
