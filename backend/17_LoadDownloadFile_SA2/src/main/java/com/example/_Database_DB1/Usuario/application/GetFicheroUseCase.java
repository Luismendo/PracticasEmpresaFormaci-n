package com.example._Database_DB1.Usuario.application;

import com.example._Database_DB1.Usuario.application.Port.GetFicheroPort;
import com.example._Database_DB1.Usuario.domain.Fichero;
import com.example._Database_DB1.Usuario.domain.FicheroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetFicheroUseCase implements GetFicheroPort {
    @Autowired
    FicheroRepositorio ficheroRepositorio;


    public List<Fichero> getAll(){
        return ficheroRepositorio.findAll();
    }

    @Override
    public Fichero getById(int id) throws Exception {
        return ficheroRepositorio.findById(id).orElseThrow(() -> new Exception("No se encuentra"));
    }

    @Override
    public List<Fichero> getByName(String name) {
        return ficheroRepositorio.findByName(name);
    }
}
