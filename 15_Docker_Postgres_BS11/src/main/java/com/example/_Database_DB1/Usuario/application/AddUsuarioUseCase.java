package com.example._Database_DB1.Usuario.application;

import com.example._Database_DB1.Usuario.application.Port.AddUsuarioPort;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.domain.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddUsuarioUseCase implements AddUsuarioPort {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public void AddUser(Usuario usuario){
        usuarioRepositorio.save(usuario);
    }

    public boolean validValues(Usuario usuario) throws Exception {
        if (usuario.getUsuario()==null) {throw new Exception("Usuario no puede ser nulo"); }
        if (usuario.getUsuario().length()>10) { throw new Exception("Longitud de usuario no puede ser superior a 10 caracteres");}
        if (usuario.getPassword()==null) {throw new Exception("getPassword no puede ser nulo"); }
        if (usuario.getName()==null) {throw new Exception("getName no puede ser nulo"); }
        if (usuario.getCompany_email()==null) {throw new Exception("getCompany_email no puede ser nulo"); }
        if (usuario.getCity()==null) {throw new Exception("getCity no puede ser nulo"); }
        if (usuario.getActive()==null) {throw new Exception("getActive no puede ser nulo"); }
        if (usuario.getCreated_date()==null) {throw new Exception("getCreated_date no puede ser nulo"); }
        if (usuario.getPersonal_email()==null) {throw new Exception("getPersonal_email no puede ser nulo"); }

        return true;
    }

    public void createUsuario(Usuario usuario) throws Exception {
        if(validValues(usuario)){
            AddUser(usuario);
        }

    }
}
