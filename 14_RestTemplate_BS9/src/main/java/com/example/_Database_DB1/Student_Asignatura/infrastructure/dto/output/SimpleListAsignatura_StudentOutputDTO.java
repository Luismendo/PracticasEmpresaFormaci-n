package com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output;

import com.example._Database_DB1.Persona.infrastructure.dto.output.SimplePersonaOutputDTO;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class SimpleListAsignatura_StudentOutputDTO {
    private List<SimpleAsignaturaOutputDTO> simpleAsignaturaOutputDTOList = new ArrayList<SimpleAsignaturaOutputDTO>();
    private SimpleAsignaturaOutputDTO simpleAsignaturaOutputDTO;

    public SimpleListAsignatura_StudentOutputDTO() {
    }

    public SimpleListAsignatura_StudentOutputDTO(List<Student_Asignatura> student_asignaturaList) {
        student_asignaturaList.stream().forEach(elem ->
        {
            this.simpleAsignaturaOutputDTO = new SimpleAsignaturaOutputDTO(elem);
            this.simpleAsignaturaOutputDTOList.add(this.simpleAsignaturaOutputDTO);
        });


    }

}
