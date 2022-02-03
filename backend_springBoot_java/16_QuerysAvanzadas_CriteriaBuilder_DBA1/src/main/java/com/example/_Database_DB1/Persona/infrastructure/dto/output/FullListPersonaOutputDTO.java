package com.example._Database_DB1.Persona.infrastructure.dto.output;

import com.example._Database_DB1.Persona.domain.Persona;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class FullListPersonaOutputDTO {
    private List<FullPersonaOutputDTO> fullPersonaOutputDTOList = new ArrayList<FullPersonaOutputDTO>();
    private FullPersonaOutputDTO fullPersonaOutputDTO;

    public FullListPersonaOutputDTO() {
    }

    public FullListPersonaOutputDTO(List<Persona> personaList) {

        personaList.stream().forEach(elem ->
        {
            this.fullPersonaOutputDTO = new FullPersonaOutputDTO(elem);
            this.fullPersonaOutputDTOList.add(this.fullPersonaOutputDTO);
        });


    }

}
