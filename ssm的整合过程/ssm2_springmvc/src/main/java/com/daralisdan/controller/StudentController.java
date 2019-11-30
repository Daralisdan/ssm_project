package com.daralisdan.controller;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.daralisdan.pojo.Student;
import com.daralisdan.service.IStudentService;

@Controller
@RequestMapping("/test")
public class StudentController {
  // 第一种注解Service的方式
  // @Resource(name = "studentService")
  // 第二种方式
  @Autowired
  @Qualifier("studentService")
  private IStudentService service;

  public void setService(IStudentService service) {
    this.service = service;
  }

  @RequestMapping("register.do")
  public String doRegister(String name, int age) {
    Student student = new Student(name, age);
    service.addStudent(student);
    return "/welcome.jsp";
  }

}
