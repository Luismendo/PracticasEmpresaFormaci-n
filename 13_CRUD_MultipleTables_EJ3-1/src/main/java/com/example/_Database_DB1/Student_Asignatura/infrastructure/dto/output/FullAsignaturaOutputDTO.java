package com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output;


import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class FullAsignaturaOutputDTO {

    private String id;
    private String branch;
    private String Comments;
    private Date init_day;
    private Date fin_day;
    private int id_persona;

    private String id_student;
    private String branch_student;
    private String comment_student;
    private int hours_student;



    public FullAsignaturaOutputDTO() {
    }

    public FullAsignaturaOutputDTO(Student_Asignatura student_asignatura) {

        this.setId(student_asignatura.getId_asignatura());
        this.setBranch(student_asignatura.getAsignatura());
        this.setComments(student_asignatura.getComents());
        this.setInit_day(student_asignatura.getInitial_date());
        this.setFin_day(student_asignatura.getFinish_date());



        this.setId_student(student_asignatura.getStudent_asig().getId_student());
        this.setBranch_student(student_asignatura.getStudent_asig().getBranch());
        this.setComment_student(student_asignatura.getStudent_asig().getComments());
        this.setHours_student(student_asignatura.getStudent_asig().getNum_hours_week());

    }

}
