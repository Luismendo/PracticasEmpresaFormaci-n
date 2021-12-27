package com.example._Database_DB1.Student.infrastructure.dto.output;

import com.example._Database_DB1.Student.domain.student;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class ListStudentOutputDTO {
    private List<StudentOutputDTO> studentOutputDTOList = new ArrayList<StudentOutputDTO>();
    private StudentOutputDTO studentOutputDTO;

    public ListStudentOutputDTO() {
    }

    public ListStudentOutputDTO(List<student> personaList) {
        personaList.stream().forEach(elem ->
        {
            this.studentOutputDTO = new StudentOutputDTO(elem);
            this.studentOutputDTOList.add(this.studentOutputDTO);
        });

    }

}
