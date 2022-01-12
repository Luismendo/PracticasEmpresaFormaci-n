package com.example.demo;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String city;
    private int age;

    public void setId(long id) {
        this.id = id;
    }

    public User(long id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }
}
