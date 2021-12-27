package com.example._Database_DB1.Student.domain;


import com.example._Database_DB1.Persona.domain.Persona;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @Column(name = "ID_STUDENT")
    private String id_student;

    @NotNull
    private String branch;
    @NotNull
    private String comments;
    @NotNull
    private int num_hours_week;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    private Persona persona;

    /*
    @OneToOne(mappedBy = "id_profesor")
    private com.example._Database_DB1.Student.domain.Profesor Profesor;

    @OneToMany(mappedBy = "Student", cascade = CascadeType.ALL)
    private com.example._Database_DB1.Student.domain.estudiante_asignatura estudiante_asignatura;

     */

}
