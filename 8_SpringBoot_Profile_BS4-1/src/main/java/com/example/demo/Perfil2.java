package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Perfil2 implements Perfiles{
    private String perfil = "pepe";
    @Override
    public void miFuncion() {
        System.out.println("Eres el usuario " + perfil);
    }
}
