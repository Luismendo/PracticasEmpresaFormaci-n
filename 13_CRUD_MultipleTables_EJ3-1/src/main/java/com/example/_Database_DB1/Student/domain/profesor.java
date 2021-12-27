package com.example._Database_DB1.Student.domain;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class profesor {
    @Id
    @GeneratedValue
    @Column(name = "ID_PROFESOR")
    private String id_profesor;
    @NotNull
    private String branch;
    @NotNull
    private String coments;
    @NotNull
    private int num_hours_week;


    private String id_persona;

    /*
    @OneToOne(mappedBy = "id_persona")
    private com.example._Database_DB1.Student.domain.persona persona;

     */

    @OneToOne
    @JoinColumn(name = "ID_ASIGNATURA")
    @MapsId
    private com.example._Database_DB1.Student.domain.estudiante_asignatura estudiante_asignatura;

    @OneToOne
    @JoinColumn(name = "ID_STUDENT")
    @MapsId
    private com.example._Database_DB1.Student.domain.student student;

}
