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

@RestController()
public class Controller1 {

    @GetMapping("/")
    @ResponseBody
    public String info() {
        return "Paths:<br>"+
                "<b>/user/algo ==> coge param 'algo' de url</b><br>" +
                "<b style='color:red;'>/useradd ==> añade un usuario por json y devuelve ese user +1 edad  (solo postman)</b><br>"+
                "===========================<br>"+
                "/post?var1=param1&?var2=param2 ==> pasamos parametros en variable<br>"+
                "/usershow ==> listado de users guardados<br>"+
                "Estructura de la clase:<br>"+
                "{<br>" +
                "    \"name\": \"nombre\",<br>" +
                "    \"city\": \"ciudad\",<br>" +
                "    \"age\": edad<br>" +
                "}";



    }

    @GetMapping("/user/{id}")
    public String getHola(@PathVariable String id) {
        return "He recibido tu parámetro " + id;

    }

    @PutMapping("/post")
    @ResponseBody
    public String getId(@RequestParam(defaultValue = "bad request") String var1,String var2) {
        return "Parametro var1: " + var1 +" <br> "+
                "Parametro var2: " + var2;
    }


    @Autowired
    ManageUsers_Interface manageUsers;



    @GetMapping("/usershow")
    public List<User> getUSer() {
        //User UserResponse = new User(1,"luis","Malaga",15);

        return manageUsers.getUserList();
    }

    @PostMapping("/useradd")
    @ResponseBody
    public User add(@RequestBody User user) {
        manageUsers.setUserID(manageUsers.getCountIncrement());
        manageUsers.setUserName(user.getName());
        manageUsers.setUserCity(user.getCity());
        manageUsers.setUserAge(user.getAge());
        manageUsers.addUserList(manageUsers.getUser());
        return  manageUsers.getUser();
    }
}
