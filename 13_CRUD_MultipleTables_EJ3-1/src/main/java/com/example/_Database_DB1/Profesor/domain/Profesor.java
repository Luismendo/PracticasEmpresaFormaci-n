package com.example._Database_DB1.Profesor.domain;



import com.example._Database_DB1.Persona.domain.Persona;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Profesor {
    @Id
    @Column(name = "ID_PROFESOR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id_profesor;

    @NotNull
    private String branch;
    @NotNull
    private String coments;


    @OneToOne(mappedBy = "id_persona")
    private Persona persona;

    /*
    @OneToOne
    @JoinColumn(name = "ID_ASIGNATURA")
    @MapsId
    private com.example._Database_DB1.Student.domain.estudiante_asignatura estudiante_asignatura;

    @OneToOne
    @JoinColumn(name = "ID_STUDENT")
    @MapsId
    private com.example._Database_DB1.Student.domain.Student Student;
     */


}

