package com.example._Database_DB1.Student.application;

import com.example._Database_DB1.Student.application.Port.DeleteUsuarioPort;
import com.example._Database_DB1.Student.domain.NotFoundException;
import com.example._Database_DB1.Student.domain.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUsuarioUseCase implements DeleteUsuarioPort {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;


    @Override
    public void deleteById(int id) throws NotFoundException {
        if(usuarioRepositorio.findById(id).isPresent()){
            usuarioRepositorio.deleteById(id);
        }
    }
}
