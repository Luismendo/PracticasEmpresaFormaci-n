package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController()
public class Controller1 {

    @PostConstruct
    public void func1(){
        System.out.println("“Hola desde clase inicial");
    }
    /*
    @Bean
    public Func2 func2(){
        return new Func2();
    }
    @Bean
    public Func3 func3(){
        return new Func3();
    }
    */
    @Bean
    CommandLineRunner func2(){
        return p -> { System.out.println("Hola desde clase secundaria"); };
    }
    @Bean
    CommandLineRunner func3(){
        return p -> { System.out.println("Soy la tercera clase"); };
    }


    @GetMapping("/user/{name}")
    public String getHola(@PathVariable String name) {
        return "Hola " + name;

    }
}
