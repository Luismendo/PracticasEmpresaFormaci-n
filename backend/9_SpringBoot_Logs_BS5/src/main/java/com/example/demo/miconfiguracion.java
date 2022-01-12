package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class miconfiguracion {

    //seteamos de cual variable viene el valor con @Value
    @Value("${var4}")
    private String var4;
    @Value("${var6}")
    private String var6;
    //estará null porque no se seta
    private String var5;




}
