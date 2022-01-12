package com.example._Database_DB1.Student_Asignatura.infrastructure.dto.input;

import com.example._Database_DB1.Persona.application.Port.GetUsuarioPort;
import com.example._Database_DB1.Student.application.Port.GetStudentPort;
import com.example._Database_DB1.Student_Asignatura.application.Port.GetAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;


@Data
@Component
public class Student_AsignaturaInputDTO {

    private String id;
    private String branch;
    private String Comments;

    private Date init_day;
    private Date fin_day;

    private String id_persona;




    public Student_Asignatura Change(Student_AsignaturaInputDTO student_asignaturaInputDTO, GetStudentPort getStudentPort) {
        Student_Asignatura student_asignatura = new Student_Asignatura();

        student_asignatura.setId_asignatura(student_asignaturaInputDTO.getId());
        student_asignatura.setAsignatura(student_asignaturaInputDTO.getBranch());
        student_asignatura.setComents(student_asignaturaInputDTO.getComments());

        student_asignatura.setInitial_date(student_asignaturaInputDTO.getInit_day());
        student_asignatura.setFinish_date(student_asignaturaInputDTO.getFin_day());

        //student_asignatura.setStudent_asig(null);
        if(student_asignaturaInputDTO.getId_persona() != null){
            student_asignatura.setStudent_asig(getStudentPort.getById(student_asignaturaInputDTO.getId_persona()));
        }else {
            student_asignatura.setStudent_asig(null);
        }



        return student_asignatura;
    }


}
