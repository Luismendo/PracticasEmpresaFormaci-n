package com.example._Database_DB1.Persona.application;

import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Persona.domain.Persona;
import com.example._Database_DB1.Persona.domain.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUsuarioUseCase implements GetUsuarioPort {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;


    public List<Persona> getAll(){
        return usuarioRepositorio.findAll();
    }

    @Override
    public Persona getById(int id) throws NotFoundException {
        if(usuarioRepositorio.findById(id).isPresent()){
            return usuarioRepositorio.findById(id).get();
        }else {
            throw new NotFoundException("No existe el id");
        }
    }

    @Override
    public List<Persona> getByName(String name) {
        return usuarioRepositorio.findByName(name);
    }
}
