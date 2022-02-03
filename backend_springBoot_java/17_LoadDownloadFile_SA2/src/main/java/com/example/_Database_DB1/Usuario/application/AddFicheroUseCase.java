package com.example._Database_DB1.Usuario.application;

import com.example._Database_DB1.Usuario.application.Port.AddFicheroPort;
import com.example._Database_DB1.Usuario.domain.Fichero;
import com.example._Database_DB1.Usuario.domain.FicheroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddFicheroUseCase implements AddFicheroPort {
    @Autowired
    FicheroRepositorio ficheroRepositorio;

    @Override
    public void AddFichero(Fichero fichero){
        ficheroRepositorio.save(fichero);
    }

}
