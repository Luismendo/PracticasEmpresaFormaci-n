package com.example._Database_DB1.Usuario.application.Port;

import com.example._Database_DB1.Usuario.domain.NotFoundException;
import com.example._Database_DB1.Usuario.domain.UnprocesableException;
import com.example._Database_DB1.Usuario.domain.Usuario;

public interface AddUsuarioPort {
    public void AddUser(Usuario usuario);
    public boolean validValues(Usuario usuario) throws UnprocesableException;
    public void createUsuario(Usuario usuario) throws UnprocesableException;
}
