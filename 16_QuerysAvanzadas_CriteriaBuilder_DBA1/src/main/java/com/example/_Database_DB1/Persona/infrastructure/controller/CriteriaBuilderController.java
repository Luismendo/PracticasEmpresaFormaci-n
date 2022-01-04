package com.example._Database_DB1.Persona.infrastructure.controller;

import com.example._Database_DB1.Persona.domain.Persona;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Persona.domain.UsuarioRepositorio;
import com.example._Database_DB1.Persona.domain.UsuarioRepositorioUseCase;
import com.example._Database_DB1.Persona.infrastructure.dto.input.UsuarioInputDTO;
import com.example._Database_DB1.Persona.infrastructure.dto.output.SimpleListPersonaOutputDTO;
import com.example._Database_DB1.Persona.infrastructure.dto.output.SimplePersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class CriteriaBuilderController {
    @Autowired
    UsuarioRepositorioUseCase usuarioRepositorioUseCase;

    @GetMapping("/pesonalizado")
    public List<SimplePersonaOutputDTO> searchConditions(@RequestBody HashMap<String, Object> conditions) throws UnprocesableException {

        return new SimpleListPersonaOutputDTO(usuarioRepositorioUseCase.getData(conditions)).getSimplePersonaOutputDTOList();
    }

}
