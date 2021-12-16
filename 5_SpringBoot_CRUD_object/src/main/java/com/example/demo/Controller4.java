package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController()
public class Controller4 {
    @Autowired
    ManageUsers_Interface manageUsers;



    @RequestMapping(value = "/persona/{id}", method = GET)
    public User getUSer(@PathVariable int id) {
        int IdMatch = manageUsers.getIdMatch(id,manageUsers.getUserList());
        return manageUsers.getUserList().get(IdMatch);
    }

}
