package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController()
public class Controller_GET {
    @Autowired
    ManageUsers_Interface manageUsers;



    @RequestMapping(value = "/persona/{id}", method = GET)
    public User getUSer(@PathVariable int id) {
        int IdMatch = manageUsers.getIdMatch(id,manageUsers.getUserList());
        if(IdMatch >= 0){
            return manageUsers.getUserList().get(IdMatch);
        }
        return null;
    }

    @RequestMapping(value = "/persona/nombre/{name}", method = GET)
    public List<User> getUSer(@PathVariable String name) {
        return manageUsers.getNameMatch(name,manageUsers.getUserList());
    }


}
