package com.example._Database_DB1.Profesor.infrastructure.dto.output;

import com.example._Database_DB1.Profesor.domain.Profesor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class ListProfesorOutputDTO {
    private List<FullProfesorOutputDTO> fullProfesorOutputDTOList = new ArrayList<FullProfesorOutputDTO>();
    private FullProfesorOutputDTO fullProfesorOutputDTO;

    public ListProfesorOutputDTO() {
    }

    public ListProfesorOutputDTO(List<Profesor> personaList) {
        personaList.stream().forEach(elem ->
        {
            this.fullProfesorOutputDTO = new FullProfesorOutputDTO(elem);
            this.fullProfesorOutputDTOList.add(this.fullProfesorOutputDTO);
        });

    }

}
