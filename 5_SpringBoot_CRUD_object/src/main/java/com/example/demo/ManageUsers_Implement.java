package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ManageUsers_Implement implements ManageUsers_Interface{
    @Autowired
    User user;

    private final AtomicLong counter = new AtomicLong();
    private List<User> listaUsers = new ArrayList<>();

    @Override
    public int getIdMatch(int id, List<User> list) {
        for(int i = 0; i < list.size(); i++){
            long UserId = list.get(i).getId();
            if(UserId == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<User> getNameMatch(String name, List<User> list) {
        List<User> tempMatch = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                tempMatch.add(list.get(i));
            }
        }
        return tempMatch;
    }

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
