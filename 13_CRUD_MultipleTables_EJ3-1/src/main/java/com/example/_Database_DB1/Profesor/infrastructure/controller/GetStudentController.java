package com.example._Database_DB1.Profesor.infrastructure.controller;

import com.example._Database_DB1.Profesor.application.Port.GetProfesorPort;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.FullProfesorOutputDTO;
import com.example._Database_DB1.Profesor.infrastructure.dto.output.ListStudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetStudentController {
    @Autowired
    GetProfesorPort getProfesorPort;

    @GetMapping("/Student")
    public List<FullProfesorOutputDTO> getAll(){
        return new ListStudentOutputDTO(getProfesorPort.getAll()).getFullProfesorOutputDTOList();
    }
}
