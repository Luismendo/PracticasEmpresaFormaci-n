package com.example.demo;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@Profile("perfil2")
@Data
public class Perfil2 implements Perfiles{
    private String perfil = "perfil2";

    @GetMapping("/perfil")
    @Override
    public void miFuncion() {
        System.out.println("Eres el perfil " + perfil);
    }
}
