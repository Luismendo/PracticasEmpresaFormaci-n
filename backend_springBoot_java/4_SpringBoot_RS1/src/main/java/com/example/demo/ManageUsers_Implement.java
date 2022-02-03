package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ManageUsers_Implement implements ManageUsers_Interface{
    private User user = new User();
    private final AtomicLong counter = new AtomicLong();
    private List<User> listaUsers = new ArrayList<>();

    @Override
    public List<User> getUserList() {
        return listaUsers;
    }

    @Override
    public void addUserList(User user) {
        listaUsers.add(user);

    }

    @Override
    public long getCountIncrement() {
        return counter.getAndIncrement();
    }

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
