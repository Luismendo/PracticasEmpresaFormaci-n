package com.example._Database_DB1.Persona.infrastructure.dto.output;

import com.example._Database_DB1.Persona.domain.persona;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class UsuarioOutputDTO{
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

    public UsuarioOutputDTO() {
    }

    public UsuarioOutputDTO(persona persona) {
        this.setUsuario(persona.getUsuario());
        this.setPassword(persona.getPassword());
        this.setName(persona.getName());
        this.setSurname(persona.getSurname());
        this.setCompany_email(persona.getCompany_email());
        this.setPersonal_email(persona.getPersonal_email());
        this.setCity(persona.getCity());
        this.setActive(persona.getActive());
        this.setCreated_date(persona.getCreated_date());
        this.setImagen_url(persona.getImagen_url());
        this.setTermination_date(persona.getTermination_date());

    }

}
