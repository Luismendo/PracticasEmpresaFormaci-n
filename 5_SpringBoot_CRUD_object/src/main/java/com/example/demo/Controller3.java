package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController()
public class Controller3 {
    @Autowired
    ManageUsers_Interface manageUsers;

    @RequestMapping(value = "/persona/{id}", method = DELETE)
    @ResponseBody
    public void getId(@PathVariable int id) {
        int IdMatch = manageUsers.getIdMatch(id,manageUsers.getUserList());
        manageUsers.getUserList().remove(IdMatch);
        //return manageUsers.getUserList().get(IdMatch);
    }
}
