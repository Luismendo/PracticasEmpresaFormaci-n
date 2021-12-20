package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controller1 {
    @Autowired
    private HoldProperties holdProperties;
    @Autowired
    private miconfiguracion miconfiguracion;

    @GetMapping("/parametros")
    public String getVars() {
        return "valor de var1 es: "+holdProperties.getUrl()+ "<br>password es: "+ holdProperties.getPassword();

    }

    @GetMapping("/miconfiguracion")
    public String getVar3() {
        return miconfiguracion.toString();

    }
}
