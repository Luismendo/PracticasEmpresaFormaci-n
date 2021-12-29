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

    public Student_Asignatura() {
    }

    public Student_Asignatura(Student_Asignatura student_asignatura) {
        this.id_asignatura = student_asignatura.getId_asignatura();
        this.asignatura = student_asignatura.getAsignatura();
        this.coments = student_asignatura.getComents();
        this.initial_date = student_asignatura.getInitial_date();
        this.finish_date = student_asignatura.getFinish_date();
        this.student_asig = student_asignatura.getStudent_asig();
    }


}

