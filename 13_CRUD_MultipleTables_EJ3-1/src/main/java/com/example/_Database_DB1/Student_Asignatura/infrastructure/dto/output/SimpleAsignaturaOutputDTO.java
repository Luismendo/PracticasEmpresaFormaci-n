package com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output;


import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class SimpleAsignaturaOutputDTO {
    private String id_asig;
    private String branch;
    private String Comments;
    private Date init_day;
    private Date fin_day;
    private String id_student;

    public SimpleAsignaturaOutputDTO() {
    }

    public SimpleAsignaturaOutputDTO(Student_Asignatura student_asignatura) {
        this.setId_asig(student_asignatura.getId_asignatura());
        this.setBranch(student_asignatura.getAsignatura());
        this.setComments(student_asignatura.getComents());
        this.setInit_day(student_asignatura.getInitial_date());
        this.setFin_day(student_asignatura.getFinish_date());

        if(student_asignatura.getStudent_asig() != null){
            this.setId_student(student_asignatura.getStudent_asig().getId_student());
        }else {
            this.setId_student(null);
        }


    }


}
