package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServiceImplements implements PersonaService{
    @Autowired
    User user;
    List<Ciudad> ciudadList = new ArrayList<>();

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUserName(String name) {
        user.setName(name);
    }

    @Override
    public void setUserCity(String city) {
        user.setCity(city);
    }

    @Override
    public void setUserAge(int age) {
        user.setAge(age);
    }

    @Override
    public void setUserID(long id) {
        user.setId(id);
    }
}
