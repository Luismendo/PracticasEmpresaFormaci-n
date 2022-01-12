package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController()
public class Controller1 {
    @Autowired
    private HoldProperties holdProperties;
    @Autowired
    private HoldPropertiesVAR2 holdPropertiesVAR2;

    @GetMapping("/valores")
    public String getVars() {
        return "valor de var1 es: "+holdProperties.getVar1()+ "valor de my.var2 es: "+holdPropertiesVAR2.getVar2();

    }

    @GetMapping("/var3")
    public String getVar3() {
        return "valor de var3 es: "+holdProperties.getVar3();

    }
}
