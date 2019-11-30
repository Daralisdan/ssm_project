package com.daralisdan.pojo;

/**
 * 
 * Description：[实体类] <br>
 * @author 姚丹 <br>
 */
public class Student {
  private Integer id;
  private String name;
  private int age;

  public Student() {
    super();
  }

  public Student(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
  }

}
