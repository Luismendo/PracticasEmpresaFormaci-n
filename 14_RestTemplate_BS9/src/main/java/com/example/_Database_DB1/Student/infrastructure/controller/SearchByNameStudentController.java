package com.example._Database_DB1.Student.infrastructure.controller;

import com.example._Database_DB1.Student.application.Port.GetStudentPort;
import com.example._Database_DB1.Student.infrastructure.dto.output.ListStudentOutputDTO;
import com.example._Database_DB1.Student.infrastructure.dto.output.FullStudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchByNameStudentController {
    @Autowired
    GetStudentPort getStudentPort;

    @GetMapping("/usuario/name/{name}")
    public List<FullStudentOutputDTO> getByName(@PathVariable String name){
        return new ListStudentOutputDTO(getStudentPort.getByName(name)).getFullStudentOutputDTOList();
    }
}
