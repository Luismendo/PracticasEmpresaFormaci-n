package com.example._Database_DB1.Student.application;

import com.example._Database_DB1.Student.application.Port.DeleteUsuarioPort;
import com.example._Database_DB1.Student.domain.NotFoundException;
import com.example._Database_DB1.Student.domain.StudentRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUsuarioUseCase implements DeleteUsuarioPort {
    @Autowired
    StudentRepositorio studentRepositorio;


    @Override
    public void deleteById(String id) throws NotFoundException {
        if(studentRepositorio.findById(id).isPresent()){
            studentRepositorio.deleteById(id);
        }
    }

}
