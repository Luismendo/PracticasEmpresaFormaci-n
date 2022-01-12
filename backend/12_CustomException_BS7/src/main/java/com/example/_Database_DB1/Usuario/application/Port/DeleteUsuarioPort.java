package com.example._Database_DB1.Usuario.application.Port;

import com.example._Database_DB1.Usuario.domain.NotFoundException;
import com.example._Database_DB1.Usuario.domain.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeleteUsuarioPort {
    public void deleteById(int id) throws NotFoundException;
}
