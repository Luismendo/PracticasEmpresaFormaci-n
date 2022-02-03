package com.example._Database_DB1.Student.domain;


import com.example._Database_DB1.Persona.domain.Persona;
import com.example._Database_DB1.Profesor.domain.Profesor;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.*;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.List;

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
    private Persona persona_student;

    @OneToMany(orphanRemoval = true, mappedBy = "student_asig", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student_Asignatura> student_asignaturaList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "ID_PROFESOR")
    private Profesor mi_profesor;

}
