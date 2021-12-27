package com.example._Database_DB1.Student.application;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student.application.Port.DeleteStudentPort;
import com.example._Database_DB1.Student.domain.StudentRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteStudentUseCase implements DeleteStudentPort {
    @Autowired
    StudentRepositorio studentRepositorio;


    @Override
    public void deleteById(String id) throws NotFoundException {
        if(studentRepositorio.findById(id).isPresent()){
            studentRepositorio.deleteById(id);
        }
    }

}
