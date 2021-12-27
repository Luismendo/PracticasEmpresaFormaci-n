package com.example._Database_DB1.Persona.infrastructure.dto.output;

import com.example._Database_DB1.Persona.domain.Persona;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class ListUsuarioOutputDTO {
    private List<UsuarioOutputDTO> usuarioOutputDTOList = new ArrayList<UsuarioOutputDTO>();
    private UsuarioOutputDTO usuarioOutputDTO;

    public ListUsuarioOutputDTO() {
    }

    public ListUsuarioOutputDTO(List<Persona> personaList) {
        //Mejor?
        personaList.stream().forEach(elem ->
        {
            this.usuarioOutputDTO = new UsuarioOutputDTO(elem);
            this.usuarioOutputDTOList.add(this.usuarioOutputDTO);
        });

        /*
        for(int i = 0; i<usuarioList.size();i++){
            this.usuarioOutputDTO = new UsuarioOutputDTO(usuarioList.get(i));
            usuarioOutputDTOList.add(this.usuarioOutputDTO);
        }
        */

    }

}
