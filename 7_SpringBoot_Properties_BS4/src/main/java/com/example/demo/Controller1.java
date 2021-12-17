package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controller1 {



    @Bean
    CommandLineRunner func2(){
        return p -> { System.out.println("Hola desde clase secundaria"); };
    }
    @Autowired
    Test3 test3;
    @Autowired
    HoldProperties test;



    @GetMapping("/user/{name}")
    public String getHola(@PathVariable String name) {
        return "Hola " + name;

    }
}
