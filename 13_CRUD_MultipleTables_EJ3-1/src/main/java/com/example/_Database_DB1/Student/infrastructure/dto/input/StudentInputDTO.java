package com.example._Database_DB1.Student.infrastructure.dto.input;

import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Student.domain.Student;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Data
@Component
public class StudentInputDTO {

    private String id;
    private String branch;
    private String Comments;
    private int num_hours_week;
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



    public Student Change(StudentInputDTO studentInputDTO, GetUsuarioPort getUsuarioPort) {
        Student student = new Student();

        student.setId_student(this.getId());
        student.setBranch(studentInputDTO.getBranch());
        student.setNum_hours_week(studentInputDTO.getNum_hours_week());
        student.setComments(studentInputDTO.getComments());
        student.setPersona_student(getUsuarioPort.getById(this.getId_persona()));


        return student;
    }


}
