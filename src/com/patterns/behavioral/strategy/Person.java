package com.patterns.behavioral.strategy;

public class Person {
    private int age;
    private String name;
    private String phoneNum;

    public Person() {
    }

    public Person(int age, String name, String phoneNum) {
        this.age = age;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
