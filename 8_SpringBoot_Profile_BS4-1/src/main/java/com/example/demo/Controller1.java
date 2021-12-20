package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@Slf4j //etique para login en sprint
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
    @Autowired
    Perfil1 perfil1;
    @Autowired
    Perfil2 perfil2;

    @GetMapping("/perfil")
    public String perfil() {
        if(log.getName().equals(perfil1.getPerfil())){
            perfil1.miFuncion();
            return perfil1.getPerfil();
        }else {
            perfil2.miFuncion();
            return perfil2.getPerfil();
        }
        

    }
}
