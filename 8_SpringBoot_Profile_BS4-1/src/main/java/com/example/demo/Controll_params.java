package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@Component
@RestController()
public class Controll_params {
    @Value("${url: valor1 no tiene valor}")
    String url;

    @Value("${password: valor2 no tiene valor}")
    String password;

    @GetMapping("/parametros")
    public String getVars() {
        return "valor de var1 es: "+url+ "<br>password es: "+ password;

    }
}
