package com.example._Database_DB1.Profesor.domain;



import com.example._Database_DB1.Persona.domain.Persona;
import com.example._Database_DB1.Student.domain.Student;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Profesor {
    @Id
    @Column(name = "ID_PROFESOR")
    private String id_profesor;

    @NotNull
    private String branch;
    @NotNull
    private String coments;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    private Persona persona_profesor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_STUDENT")
    private Student student_profesor;

    @OneToMany(mappedBy = "mi_profesor", cascade = CascadeType.ALL)
    private List<Student> studentList = new ArrayList<>();


    /*
    @OneToOne
    @JoinColumn(name = "ID_ASIGNATURA")
    @MapsId
    private com.example._Database_DB1.Student.domain.Student_Asignatura Student_Asignatura;
     */


}

