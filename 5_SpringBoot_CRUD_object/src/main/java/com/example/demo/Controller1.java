package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController()
public class Controller1 {
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
