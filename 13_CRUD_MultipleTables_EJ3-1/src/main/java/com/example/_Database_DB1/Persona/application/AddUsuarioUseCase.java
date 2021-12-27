package com.example._Database_DB1.Persona.application;

import com.example._Database_DB1.Persona.application.Port.AddUsuarioPort;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Persona.domain.persona;
import com.example._Database_DB1.Persona.domain.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddUsuarioUseCase implements AddUsuarioPort {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public void AddUser(persona persona){
        usuarioRepositorio.save(persona);
    }

    public boolean validValues(persona persona) throws UnprocesableException {
        if (persona.getUsuario()==null) {throw new UnprocesableException("Usuario no puede ser nulo"); }
        if (persona.getUsuario().length()>10) { throw new UnprocesableException("Longitud de usuario no puede ser superior a 10 caracteres");}
        if (persona.getPassword()==null) {throw new UnprocesableException("getPassword no puede ser nulo"); }
        if (persona.getName()==null) {throw new UnprocesableException("getName no puede ser nulo"); }
        if (persona.getCompany_email()==null) {throw new UnprocesableException("getCompany_email no puede ser nulo"); }
        if (persona.getCity()==null) {throw new UnprocesableException("getCity no puede ser nulo"); }
        if (persona.getActive()==null) {throw new UnprocesableException("getActive no puede ser nulo"); }
        if (persona.getCreated_date()==null) {throw new UnprocesableException("getCreated_date no puede ser nulo"); }
        if (persona.getPersonal_email()==null) {throw new UnprocesableException("getPersonal_email no puede ser nulo"); }

        return true;
    }

    public void createUsuario(persona persona) throws UnprocesableException {
        if(validValues(persona)){
            AddUser(persona);
        }
    }
}
