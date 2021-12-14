package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
                "<b>/user/{name} ==> saluda al usuario, {name} sin {}</b><br>" +
                "<b style='color:red;'>/useradd ==> añade un usuario por json y devuelve ese user +1 edad  (solo postman)</b><br>"+
                "===========================<br>"+
                "/id/algo ==> Parametro id + algo<br>"+
                "/usershow ==> listado de users guardados<br>"+
                "Estructura de la clase:<br>"+
                "{<br>" +
                "    \"name\": \"nombre\",<br>" +
                "    \"city\": \"ciudad\",<br>" +
                "    \"age\": edad<br>" +
                "}";



    }

    @GetMapping("/user/{name}")
    public String getHola(@PathVariable String name) {
        return "Hola " + name;

    }

    @GetMapping("/id")
    @ResponseBody
    public String getId(@RequestParam(defaultValue = "bad request") String id) {
        return "Parametro id: " + id;
    }

    private final AtomicLong counter = new AtomicLong();
    List<User> listaUsers = new ArrayList<>();

    @GetMapping("/usershow")
    public List<User> getUSer() {
        //User UserResponse = new User(1,"luis","Malaga",15);

        return listaUsers;
    }

    @PostMapping("/useradd")
    @ResponseBody
    public User add(@RequestBody User user) {
        user.setId(counter.getAndIncrement());
        listaUsers.add(new User(counter.get(), user.getName(), user.getCity(), user.getAge()));
        user.setAge(user.getAge()+1);
        return  user;
    }
}
