package com.example._Database_DB1.Persona.infrastructure.dto.input;

import com.example._Database_DB1.Persona.domain.persona;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class UsuarioInputDTO{

    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String company_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String imagen_url;
    private Date termination_date;



    public persona Change(UsuarioInputDTO usuarioInputDTO) {
        persona persona = new persona();
        //usuario.s.id = usuarioInputDTO.;
        persona.setUsuario(usuarioInputDTO.getUsuario());
        persona.setPassword(usuarioInputDTO.getPassword());
        persona.setName(usuarioInputDTO.getName());
        persona.setSurname(usuarioInputDTO.getSurname());
        persona.setCompany_email(usuarioInputDTO.getCompany_email());
        persona.setPersonal_email(usuarioInputDTO.getPersonal_email());
        persona.setCity(usuarioInputDTO.getCity());
        persona.setActive(usuarioInputDTO.getActive());
        persona.setCreated_date(usuarioInputDTO.getCreated_date());
        persona.setImagen_url(usuarioInputDTO.getImagen_url());
        persona.setTermination_date(usuarioInputDTO.getTermination_date());

        return persona;
    }
}
