package com.example._Database_DB1.Persona.infrastructure.dto.output;

import com.example._Database_DB1.Persona.domain.Persona;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class SimpleListPersonaOutputDTO {
    private List<SimplePersonaOutputDTO> simplePersonaOutputDTOList = new ArrayList<SimplePersonaOutputDTO>();
    private SimplePersonaOutputDTO simplePersonaOutputDTO;

    public SimpleListPersonaOutputDTO() {
    }

    public SimpleListPersonaOutputDTO(List<Persona> personaList) {
        //Mejor?
        personaList.stream().forEach(elem ->
        {
            this.simplePersonaOutputDTO = new SimplePersonaOutputDTO(elem);
            this.simplePersonaOutputDTOList.add(this.simplePersonaOutputDTO);
        });

        /*
        for(int i = 0; i<usuarioList.size();i++){
            this.simplePersonaOutputDTO = new SimplePersonaOutputDTO(usuarioList.get(i));
            simplePersonaOutputDTOList.add(this.simplePersonaOutputDTO);
        }
        */

    }

}
