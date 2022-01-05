package com.example._Database_DB1.Usuario.application.Port;

import com.example._Database_DB1.Usuario.domain.Fichero;

import java.util.List;

public interface GetFicheroPort {
    public List<Fichero> getAll();
    public Fichero getById(int id) throws Exception;
    public List<Fichero> getByName(String name);
}
