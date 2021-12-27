package com.example._Database_DB1.Student.infrastructure.dto.input;

import com.example._Database_DB1.Persona.domain.UsuarioRepositorio;
import com.example._Database_DB1.Student.domain.student;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class StudentInputDTO {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    private String branch;
    private String Comments;
    private int Num_hours_week;
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



    public student Change(StudentInputDTO studentInputDTO) {
        student student = new student();

        student.setBranch(studentInputDTO.getBranch());
        student.setNum_hours_week(studentInputDTO.getNum_hours_week());
        student.setComments(studentInputDTO.getComments());
        student.setPersona(usuarioRepositorio.getById(studentInputDTO.getId_persona()));


        return student;
    }
}
