package com.huangtan666.domain;

import java.io.Serializable;

/**
 * 学生类作为公共api，将来在dubbo框架中以二进制的数据格式进行传输，所以需要进行序列化
 */
public class Student implements Serializable {
    private Integer id;
    private String name;
    private String age;

    public Student() {
    }

    public Student(Integer id, String name, String age) {
        this.id = id;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
