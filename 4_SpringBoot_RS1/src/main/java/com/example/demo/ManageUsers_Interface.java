package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


public interface ManageUsers_Interface {
    List<User> getUserList();
    void addUserList(User user);

    long getCountIncrement();

    User getUser();
    void setUserName(String name);
    void setUserCity(String city);
    void setUserAge(int age);
    void setUserID(long id);
}
