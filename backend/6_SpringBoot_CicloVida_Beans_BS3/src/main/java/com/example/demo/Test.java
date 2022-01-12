package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class Test {
    public Test() {
    }

    @PostConstruct
    public void func1(){
        System.out.println("Hola desde clase inicial");
    }
}
