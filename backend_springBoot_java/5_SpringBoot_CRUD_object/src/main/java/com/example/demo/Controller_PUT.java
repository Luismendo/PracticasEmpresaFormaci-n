package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController()
public class Controller_PUT {
    @Autowired
    ManageUsers_Interface manageUsers;

    @RequestMapping(value = "/persona/{id}", method = PUT)
    @ResponseBody
    public void getId(@RequestBody User user,@PathVariable int id) {
        user.setId(id);
        int IdMatch = manageUsers.getIdMatch(id,manageUsers.getUserList());
        if(IdMatch >= 0){
            if (user.getName() != null) {
                manageUsers.getUserList().get(IdMatch).setName(user.getName());
            }
            if (user.getCity() != null) {
                manageUsers.getUserList().get(IdMatch).setName(user.getCity());
            }
            if (user.getAge() != 0) {
                manageUsers.getUserList().get(IdMatch).setAge(user.getAge());
            }
        }
        //return manageUsers.getUserList().get(IdMatch);
    }
}
