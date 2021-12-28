package com.example._Database_DB1.Student.infrastructure.dto.output;


import com.example._Database_DB1.Student.domain.Student;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class SimpleStudentOutputDTO {
    private String id;
    private String branch;
    private String Comments;
    private int Num_hours_week;
    private int id_person;

    public SimpleStudentOutputDTO() {
    }

    public SimpleStudentOutputDTO(Student student) {
        this.setId(student.getId_student());
        this.setBranch(student.getBranch());
        this.setComments(student.getComments());
        this.setNum_hours_week(student.getNum_hours_week());
        this.setId_person(student.getPersona_student().getId_persona());

    }


}
