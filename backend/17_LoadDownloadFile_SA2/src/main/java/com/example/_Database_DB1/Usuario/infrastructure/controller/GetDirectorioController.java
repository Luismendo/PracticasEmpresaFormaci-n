package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.GetFicheroPort;
import com.example._Database_DB1.Usuario.infrastructure.DTO.FicheroInputDTO;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;


@RestController
public class GetDirectorioController {
    @Autowired
    GetFicheroPort getFicheroPort;

    @Autowired
    FicheroInputDTO ficheroInputDTO;

    @Value("${pathfile}")
    String pathfile;



    @GetMapping("/setpath")
    public String setpath(@RequestParam("path") String path) throws IOException {
        System.out.println("============================= " + ficheroInputDTO.getDir());
        ficheroInputDTO.setDir(path + "/");
        System.out.println("============================= " + ficheroInputDTO.getDir());

        File directory = new File("C:/"+pathfile+ficheroInputDTO.getDir());
        FileUtils.forceMkdir(directory);
        return pathfile + ficheroInputDTO.getDir();
    }
}
