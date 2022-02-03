package com.example._Database_DB1.Usuario.application;

import com.example._Database_DB1.Usuario.application.Port.AddUsuarioPort;
import com.example._Database_DB1.Usuario.domain.Usuario;
import com.example._Database_DB1.Usuario.domain.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


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
        //if (usuario.getPassword()==null) {throw new Exception("getPassword no puede ser nulo"); }
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

    @Override
    public void EditUsuario(Usuario usuario) {
        System.out.println("AQUI");
        System.out.println(usuarioRepositorio.getById(usuario.getId()));
        System.out.println(usuario);
        usuarioRepositorio.getById(usuario.getId()).setName(usuario.getName());
        usuarioRepositorio.getById(usuario.getId()).setUsuario(usuario.getUsuario());
        usuarioRepositorio.getById(usuario.getId()).setActive(usuario.getActive());
        usuarioRepositorio.getById(usuario.getId()).setCity(usuario.getCity());
        usuarioRepositorio.getById(usuario.getId()).setCompany_email(usuario.getCompany_email());
        usuarioRepositorio.getById(usuario.getId()).setPersonal_email(usuario.getPersonal_email());
        usuarioRepositorio.getById(usuario.getId()).setCreated_date(usuario.getCreated_date());
        usuarioRepositorio.getById(usuario.getId()).setTermination_date(usuario.getTermination_date());
        usuarioRepositorio.getById(usuario.getId()).setImagen_url(usuario.getImagen_url());
        usuarioRepositorio.flush();
        System.out.println(usuarioRepositorio.getById(usuario.getId()));

    }

}
