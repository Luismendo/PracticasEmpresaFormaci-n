package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController()
public class Controller_POST {
    @Autowired
    ManageUsers_Interface manageUsers;

    @RequestMapping(value = "/persona", method = POST)
    @ResponseBody
    public User add(@RequestBody User user) {
        manageUsers.setUserID(manageUsers.getCountIncrement());
        manageUsers.setUserName(user.getName());
        manageUsers.setUserCity(user.getCity());
        manageUsers.setUserAge(user.getAge());
        manageUsers.addUserList(new User(manageUsers.getUser().getId(),user.getName(),user.getCity(),user.getAge()));
        return  manageUsers.getUser();
    }
}
