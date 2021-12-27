package com.example._Database_DB1.Student.application;


import com.example._Database_DB1.Student.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Student.domain.NotFoundException;
import com.example._Database_DB1.Student.domain.StudentRepositorio;
import com.example._Database_DB1.Student.domain.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUsuarioUseCase implements GetUsuarioPort {
    @Autowired
    StudentRepositorio studentRepositorio;


    public List<student> getAll(){
        return studentRepositorio.findAll();
    }

    @Override
    public student getById(String id) throws NotFoundException {
        if(studentRepositorio.findById(id).isPresent()){
            return studentRepositorio.findById(id).get();
        }else {
            throw new NotFoundException("No existe el id");
        }
    }

    @Override
    public List<student> getByName(String name) {
        return studentRepositorio.findByName(name);
    }
}
