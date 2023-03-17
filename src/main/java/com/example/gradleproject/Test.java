package com.example.gradleproject;

public class Test {

    private String name;
    private Integer age;
    private Integer studentNumber;
    private Integer privateNumber;


    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getStudentNumber() {
        return this.studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void calculator() {
        System.out.println(Math.PI * this.studentNumber);
    }


}
