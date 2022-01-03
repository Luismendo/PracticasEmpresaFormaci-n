package com.example._Database_DB1.Persona.domain;


import com.example._Database_DB1.Profesor.domain.Profesor;
import com.example._Database_DB1.Student.domain.Student;
import lombok.Data;


import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Persona {
    @Id
    @GeneratedValue
    private int id_persona;

    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String company_email;
    private String personal_email;
    private String city;
    private Boolean active;

    @Temporal(TemporalType.DATE)
    private Date created_date;

    private String imagen_url;

    @Temporal(TemporalType.DATE)
    private Date termination_date;

    @OneToOne(mappedBy = "persona_profesor",fetch = FetchType.LAZY)
    private Profesor profesor;

    @OneToOne(mappedBy = "persona_student",fetch = FetchType.LAZY)
    private Student student;


/*
    @OneToOne
    @JoinColumn(name = "ID_PROFESOR")
    @MapsId
    private com.example._Database_DB1.Student.domain.Profesor Profesor;

 */
}
