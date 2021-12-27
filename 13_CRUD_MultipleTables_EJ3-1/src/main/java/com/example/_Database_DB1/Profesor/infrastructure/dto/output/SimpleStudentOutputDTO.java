package com.example._Database_DB1.Profesor.infrastructure.dto.output;


import com.example._Database_DB1.Profesor.domain.Profesor;
import lombok.Data;
import org.springframework.stereotype.Component;

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

    public SimpleStudentOutputDTO(Profesor profesor) {
        this.setId(profesor.getId_profesor());
        this.setBranch(profesor.getBranch());
        this.setComments(profesor.getComents());
        this.setId_person(profesor.getPersona().getId_persona());

    }


}
