package com.example._Database_DB1.Student_Asignatura.domain;



import com.example._Database_DB1.Profesor.domain.Profesor;
import com.example._Database_DB1.Student.domain.Student;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Student_Asignatura {
    @Id
    @Column(name = "ID_ASIGNATURA")
    private String id_asignatura;

    @NotNull
    private String asignatura;
    @NotNull
    private String coments;

    @Temporal(TemporalType.DATE)
    @NotNull
    private Date initial_date;
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date finish_date;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "ID_STUDENT")
    private Student student_asig;


}

