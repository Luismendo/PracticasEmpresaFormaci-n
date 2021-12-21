package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController()
public class Controller {

    @Autowired
    private miconfiguracion miconfiguracion;

    @GetMapping("/miconfiguracion")
    public String getVar3() {
        return miconfiguracion.toString();

    }

}
