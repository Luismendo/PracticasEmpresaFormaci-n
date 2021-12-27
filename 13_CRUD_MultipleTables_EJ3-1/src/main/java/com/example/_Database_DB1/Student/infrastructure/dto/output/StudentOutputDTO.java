package com.example._Database_DB1.Student.infrastructure.dto.output;


import com.example._Database_DB1.Student.domain.student;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class UsuarioOutputDTO{
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

    public UsuarioOutputDTO() {
    }

    public UsuarioOutputDTO(student student) {
        this.setBranch(student.getBranch());
        this.setComments(student.getComments());
        this.setNum_hours_week(student.getNum_hours_week());

        /*
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

         */

    }

}
