package com.example._Database_DB1.Usuario.application;

import com.example._Database_DB1.Usuario.application.Port.DeleteUsuarioPort;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.domain.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class DeleteUsuarioUseCase implements DeleteUsuarioPort {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;


    @Override
    public void deleteById(int id) throws Exception {
        if(usuarioRepositorio.findById(id).isPresent()){
            usuarioRepositorio.deleteById(id);
        }
    }
}
