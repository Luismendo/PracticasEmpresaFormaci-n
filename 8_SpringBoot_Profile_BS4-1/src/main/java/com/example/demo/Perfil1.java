package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Perfil1 implements Perfiles{
    private String perfil = "luis";
    @Override
    public void miFuncion() {
        System.out.println("Eres el usuario " + perfil);
    }
}
