package com.example._Database_DB1.Student.infrastructure.dto.output;

import com.example._Database_DB1.Student.domain.Student;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class ListStudentOutputDTO {
    private List<FullStudentOutputDTO> fullStudentOutputDTOList = new ArrayList<FullStudentOutputDTO>();
    private FullStudentOutputDTO fullStudentOutputDTO;

    public ListStudentOutputDTO() {
    }

    public ListStudentOutputDTO(List<Student> personaList) {
        personaList.stream().forEach(elem ->
        {
            this.fullStudentOutputDTO = new FullStudentOutputDTO(elem);
            this.fullStudentOutputDTOList.add(this.fullStudentOutputDTO);
        });

    }

}
