package com.example._Database_DB1.Profesor.infrastructure.dto.input;

import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Profesor.application.Port.GetProfesorPort;
import com.example._Database_DB1.Profesor.domain.Profesor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class ProfesorInputDTO {

    private String id;
    private String branch;
    private String Comments;
    private int id_persona;
    //private com.example._Database_DB1.Persona.domain.persona persona;
/*
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

 */



    public Profesor Change(ProfesorInputDTO studentInputDTO, GetUsuarioPort getUsuarioPort) {
        Profesor profesor = new Profesor();

        profesor.setId_profesor(studentInputDTO.getId());
        profesor.setBranch(studentInputDTO.getBranch());
        profesor.setComents(studentInputDTO.getComments());

        profesor.setPersona_profesor(getUsuarioPort.getById(this.getId_persona()));

        return profesor;
    }


}
