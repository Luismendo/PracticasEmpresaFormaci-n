package com.example.demo;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class Func3 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Soy la tercera clase");
    }
}
