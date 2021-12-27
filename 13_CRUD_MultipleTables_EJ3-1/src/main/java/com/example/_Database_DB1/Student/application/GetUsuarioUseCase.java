package com.example._Database_DB1.Student.application;

import com.example._Database_DB1.Student.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Student.domain.NotFoundException;
import com.example._Database_DB1.Student.domain.UsuarioRepositorio;
import com.example._Database_DB1.Student.domain.persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUsuarioUseCase implements GetUsuarioPort {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;


    public List<persona> getAll(){
        return usuarioRepositorio.findAll();
    }

    @Override
    public persona getById(int id) throws NotFoundException {
        if(usuarioRepositorio.findById(id).isPresent()){
            return usuarioRepositorio.findById(id).get();
        }else {
            throw new NotFoundException("No existe el id");
        }
    }

    @Override
    public List<persona> getByName(String name) {
        return usuarioRepositorio.findByName(name);
    }
}
