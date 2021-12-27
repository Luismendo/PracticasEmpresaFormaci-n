package com.example._Database_DB1.Student.infrastructure.dto.output;


import com.example._Database_DB1.Student.domain.Student;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class FullStudentOutputDTO {
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

    public FullStudentOutputDTO() {
    }

    public FullStudentOutputDTO(Student student) {
        this.setId(student.getId_student());
        this.setBranch(student.getBranch());
        this.setComments(student.getComments());
        this.setNum_hours_week(student.getNum_hours_week());


        this.setUsuario(student.getPersona().getUsuario());
        this.setPassword(student.getPersona().getPassword());
        this.setName(student.getPersona().getName());
        this.setSurname(student.getPersona().getSurname());
        this.setCompany_email(student.getPersona().getCompany_email());
        this.setPersonal_email(student.getPersona().getPersonal_email());
        this.setCity(student.getPersona().getCity());
        this.setActive(student.getPersona().getActive());
        this.setCreated_date(student.getPersona().getCreated_date());
        this.setImagen_url(student.getPersona().getImagen_url());
        this.setTermination_date(student.getPersona().getTermination_date());
    }

}
