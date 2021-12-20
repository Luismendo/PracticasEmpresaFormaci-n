package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController()
public class Controller_DELETE {
    @Autowired
    ManageUsers_Interface manageUsers;

    @RequestMapping(value = "/persona/{id}", method = DELETE)
    @ResponseBody
    public void getId(@PathVariable int id) {
        int IdMatch = manageUsers.getIdMatch(id,manageUsers.getUserList());
        if(IdMatch >= 0){
            manageUsers.getUserList().remove(IdMatch);
        }
        //return manageUsers.getUserList().get(IdMatch);
    }
}
