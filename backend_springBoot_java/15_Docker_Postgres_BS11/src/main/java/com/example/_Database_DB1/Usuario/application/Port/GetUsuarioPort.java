package com.example._Database_DB1.Usuario.application.Port;

import com.example._Database_DB1.Usuario.domain.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface GetUsuarioPort {
    public List<Usuario> getAll();
    public Usuario getById(int id) throws Exception;
    public List<Usuario> getByName(String name);
}
