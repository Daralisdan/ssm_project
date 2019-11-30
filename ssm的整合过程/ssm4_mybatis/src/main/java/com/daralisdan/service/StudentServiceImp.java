package com.daralisdan.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.daralisdan.dao.IStudentDao;
import com.daralisdan.pojo.Student;


@Service("studentService")
public class StudentServiceImp implements IStudentService {
  @Resource(name = "IStudentDao")
  private IStudentDao dao;

  // 该方法适用于配置式的方法，修改为注解式的方式，该方法就可以不需要了
  public void setDao(IStudentDao dao) {
    this.dao = dao;
  }

  @Override
  @Transactional
  public void addStudent(Student student) {
    dao.insert(student);
  }

}
