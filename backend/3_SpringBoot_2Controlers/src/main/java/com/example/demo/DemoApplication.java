package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Configuration
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean(name = "bean1")
    User getPerson1(){
        User user1 = new User(0,"bean1","nada",1);
        return user1;
    }
    @Qualifier("bean2")
    @Bean
    User getPerson2(){
        User user2 = new User(0,"bean2","nada",1);
        return user2;
    }
    @Qualifier("bean3")
    @Bean
    User getPerson3(){
        User user3 = new User(0,"bean3","nada",1);
        return user3;
    }

    @Qualifier("lista")
    @Bean
    List<Ciudad> getListCity(){
        return new ArrayList<>();
    }


}
