package com.example._Database_DB1.Profesor.infrastructure.dto.output;


import com.example._Database_DB1.Profesor.domain.Profesor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class FullProfesorOutputDTO {
    private String id;
    private String branch;
    private String Comments;
    private int Num_hours_week;

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

    public FullProfesorOutputDTO() {
    }

    public FullProfesorOutputDTO(Profesor profesor) {
        this.setId(profesor.getId_profesor());
        this.setBranch(profesor.getBranch());
        this.setComments(profesor.getComents());



        this.setUsuario(profesor.getPersona_profesor().getUsuario());
        this.setPassword(profesor.getPersona_profesor().getPassword());
        this.setName(profesor.getPersona_profesor().getName());
        this.setSurname(profesor.getPersona_profesor().getSurname());
        this.setCompany_email(profesor.getPersona_profesor().getCompany_email());
        this.setPersonal_email(profesor.getPersona_profesor().getPersonal_email());
        this.setCity(profesor.getPersona_profesor().getCity());
        this.setActive(profesor.getPersona_profesor().getActive());
        this.setCreated_date(profesor.getPersona_profesor().getCreated_date());
        this.setImagen_url(profesor.getPersona_profesor().getImagen_url());
        this.setTermination_date(profesor.getPersona_profesor().getTermination_date());
    }

}
