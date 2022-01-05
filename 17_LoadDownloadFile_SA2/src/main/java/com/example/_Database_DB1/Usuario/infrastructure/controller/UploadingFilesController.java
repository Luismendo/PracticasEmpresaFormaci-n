package com.example._Database_DB1.Usuario.infrastructure.controller;

import com.example._Database_DB1.Usuario.application.Port.AddFicheroPort;
import com.example._Database_DB1.Usuario.infrastructure.DTO.FicheroInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;

@Controller
public class UploadingFilesController {
    @GetMapping("/")
    public String index(){
        return "upload";
    }


    @Autowired
    FicheroInputDTO ficheroInputDTO;
    @Autowired
    AddFicheroPort addFicheroPort;

    @PostMapping("/upload")
    public String UploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes attributes) throws IOException, ParseException {
        if(file==null || file.isEmpty()){
            attributes.addFlashAttribute("message","Profavor seleccione archivo");
            return "redirect:status";
        }

        StringBuilder builder = new StringBuilder();
        builder.append(File.separator);
        builder.append("Users/luis.mendoza/IdeaProjects/17_LoadDownloadFile_SA2/src/main/resources/files/");
        builder.append(file.getOriginalFilename());

        byte[] fileBytes = file.getBytes();
        Path path = Paths.get(builder.toString());
        Files.write(path,fileBytes);

        addFicheroPort.AddFichero(ficheroInputDTO.Change(file.getOriginalFilename(),"lol"));

        attributes.addFlashAttribute("message","ArchivoSubido");
        return "redirect:/fichero";
    }

    @GetMapping("/status")
    public String status(){
        return "status";
    }
}