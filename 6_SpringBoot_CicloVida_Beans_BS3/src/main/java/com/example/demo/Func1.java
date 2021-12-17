package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class Func1 {

    @PostConstruct
    public void func1(){
        System.out.println("“Hola desde clase inicial");
    }
}
