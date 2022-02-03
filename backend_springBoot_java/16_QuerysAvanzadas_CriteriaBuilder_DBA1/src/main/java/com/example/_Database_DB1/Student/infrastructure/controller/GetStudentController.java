package com.example._Database_DB1.Student.infrastructure.controller;

import com.example._Database_DB1.Student.application.Port.GetStudentPort;
import com.example._Database_DB1.Student.infrastructure.dto.output.ListStudentOutputDTO;
import com.example._Database_DB1.Student.infrastructure.dto.output.FullStudentOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetStudentController {
    @Autowired
    GetStudentPort getStudentPort;

    @GetMapping("/Student")
    public List<FullStudentOutputDTO> getAll(){
        return new ListStudentOutputDTO(getStudentPort.getAll()).getFullStudentOutputDTOList();
    }
}
