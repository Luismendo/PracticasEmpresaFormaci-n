package com.example.demo;

import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Data
@Component
public class Test3 implements CommandLineRunner {
    public Test3() {
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Que rayada: " + args );
    }
}
