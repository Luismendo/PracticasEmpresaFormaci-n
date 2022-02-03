package com.example._Database_DB1.Student_Asignatura.infrastructure.dto.output;

import com.example._Database_DB1.Persona.domain.Persona;
import com.example._Database_DB1.Persona.infrastructure.dto.output.FullPersonaOutputDTO;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class FullListAsignatura_StudentOutputDTO {
    private List<FullAsignaturaOutputDTO> fullAsignaturaOutputDTOList = new ArrayList<FullAsignaturaOutputDTO>();
    private FullAsignaturaOutputDTO fullAsignaturaOutputDTO;

    public FullListAsignatura_StudentOutputDTO() {
    }

    public FullListAsignatura_StudentOutputDTO(List<Student_Asignatura> student_asignaturaList) {

        student_asignaturaList.stream().forEach(elem ->
        {
            this.fullAsignaturaOutputDTO = new FullAsignaturaOutputDTO(elem);
            this.fullAsignaturaOutputDTOList.add(this.fullAsignaturaOutputDTO);
        });


    }

}
