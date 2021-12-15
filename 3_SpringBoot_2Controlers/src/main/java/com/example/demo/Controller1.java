package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController()
public class Controller1 {
    @Autowired
    PersonaService personaService;

    @Qualifier("lista")
    @Autowired
    List<Ciudad> listaCiudades;

    @Qualifier("bean1")
    @Autowired
    User UserBean1;
    @Qualifier("bean2")
    @Autowired
    User UserBean2;
    @Qualifier("bean3")
    @Autowired
    User UserBean3;



    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/bean/{bean}")
    @ResponseBody
    public User getBean(@PathVariable String bean) {
        switch(bean){
            case "bean1":
                return UserBean1;
            case "bean2":
                return UserBean2;
            default:
                return UserBean3;
        }

    }

    @PostMapping("/controlador1/addCiudad")
    @ResponseBody
    public List<Ciudad> addCity(@RequestBody Ciudad ciudad) {
        listaCiudades.add(new Ciudad(ciudad.getName(),ciudad.getNum_habitantes()));

        return  listaCiudades;
    }

    @GetMapping("/controlador1/addPersona")
    public User listAllHeaders(@RequestHeader Map<String, String> headers) {
        int edad;
        if(headers.containsKey("age") && !headers.get("age").equals("") ){
            edad = Integer.parseInt(headers.get("age"));
        }else {
            edad = 0;
        }
        personaService.setUserID(counter.getAndIncrement());
        personaService.setUserName(headers.get("name"));
        personaService.setUserCity(headers.get("city"));
        personaService.setUserAge(edad);
        return personaService.getUser();
    }

    @GetMapping("/")
    @ResponseBody
    public String info() {
        return "Paths:<br>"+
                "<b>/controlador1/addPersona ==> cambia la inyeccion persona</b><br>" +
                "<b>/controlador2/getPersona ==> devuelve inyeccion persona cambiada</b><br>" +
                "<b style='color:red;'>/controlador1/addCiudad ==> añade una ciudad por json(solo postman)</b><br>"+
                "<b>/controlador2/getCiudad ==> devuelve lista ciudades JSON</b><br>" +
                "<b>/bean/{bean} ==> devuelve una clase inicializada</b><br>" +
                "<b>/bean/{bean} ==> devuelve una clase inicializada</b><br>" +
                "===========================<br>";



    }
}