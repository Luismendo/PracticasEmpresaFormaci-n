package com.example._Database_DB1.Student.domain;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class student {
    @Id
    @GeneratedValue
    @Column(name = "ID_STUDENT")
    private String id_student;
    @NotNull
    private String branch;
    @NotNull
    private String comments;
    @NotNull
    private int num_hours_week;


    @OneToOne(mappedBy = "ID_PERSONA")
    private com.example._Database_DB1.Persona.domain.persona persona;

    /*
    @OneToOne(mappedBy = "id_profesor")
    private com.example._Database_DB1.Student.domain.profesor profesor;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private com.example._Database_DB1.Student.domain.estudiante_asignatura estudiante_asignatura;

     */

}
