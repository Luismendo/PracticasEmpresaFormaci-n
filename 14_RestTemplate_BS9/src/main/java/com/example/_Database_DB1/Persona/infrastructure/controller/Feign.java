package com.example._Database_DB1.Persona.infrastructure.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "lol", url = "http://localhost:8081/Profesor/")
public interface Feign {

    @GetMapping("/{id}")
    public String externo(@PathVariable String id);
}
