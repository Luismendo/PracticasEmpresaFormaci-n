package com.example._Database_DB1.Usuario.application;

import com.example._Database_DB1.Usuario.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Usuario.domain.NotFoundException;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.domain.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GetUsuarioUseCase implements GetUsuarioPort {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;


    public List<Usuario> getAll(){
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario getById(int id) throws NotFoundException {
        if(usuarioRepositorio.findById(id).isPresent()){
            return usuarioRepositorio.findById(id).get();
        }else {
            throw new NotFoundException("No existe el id");
        }
    }

    @Override
    public List<Usuario> getByName(String name) {
        return usuarioRepositorio.findByName(name);
    }
}
