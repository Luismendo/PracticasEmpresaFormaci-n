package com.example._Database_DB1.Student.application;


import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student.application.Port.GetStudentPort;
import com.example._Database_DB1.Student.domain.Student;
import com.example._Database_DB1.Student.domain.StudentRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetStudentUseCase implements GetStudentPort {
    @Autowired
    StudentRepositorio studentRepositorio;


    public List<Student> getAll(){
        return studentRepositorio.findAll();
    }

    @Override
    public Student getById(String id) throws NotFoundException {
        if(studentRepositorio.findById(id).isPresent()){
            return studentRepositorio.findById(id).get();
        }else {
            throw new NotFoundException("No existe el id");
        }
    }

    @Override
    public List<Student> getByName(String name) {
        return studentRepositorio.findByName(name);
    }
}
