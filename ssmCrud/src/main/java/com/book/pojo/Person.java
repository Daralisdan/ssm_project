package com.book.pojo;

/**
 * person 实体
 * @author Administrator
 *
 */
public class Person {

    private int id;
    private String name;
    private int age;
    
    /**
     * @param name
     * @param age
     */
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    /**
     * 
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
        return "Person [id=" + id + ", name=" + name + "]";
    }
}