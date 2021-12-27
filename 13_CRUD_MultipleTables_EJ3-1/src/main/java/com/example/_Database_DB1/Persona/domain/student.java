package com.example._Database_DB1.Persona.domain;


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
    private int num_hours_week;


    @OneToOne(mappedBy = "id_persona")
    private persona persona;

    @OneToOne(mappedBy = "id_profesor")
    private profesor profesor;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private estudiante_asignatura estudiante_asignatura;

}
