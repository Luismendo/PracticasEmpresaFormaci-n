package com.example._Database_DB1.Persona.infrastructure.controller;

import com.example._Database_DB1.Profesor.application.Port.GetProfesorPort;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.SimpleProfesorOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FeController {

    @Autowired
    GetProfesorPort getProfesorPort;

    @GetMapping("/persona/profesor/{id}")
    public ResponseEntity<SimpleProfesorOutputDTO> getprofesor(@PathVariable String id){
        ResponseEntity<SimpleProfesorOutputDTO> rest= new RestTemplate().getForEntity("http://localhost:8081/fdgfiwhifuej/"+id, SimpleProfesorOutputDTO.class);
        return ResponseEntity.ok(rest.getBody());
    }
    @GetMapping("/fdgfiwhifuej/{id}")
    public SimpleProfesorOutputDTO externo(@PathVariable String id){
        return new SimpleProfesorOutputDTO(getProfesorPort.getById(id));
    }

    @Autowired
    Feign feign;

    @GetMapping("/feign/{id}")
    public String getfeign(@PathVariable String id){
        String rest= feign.externo(id);
        return rest;
    }

}
