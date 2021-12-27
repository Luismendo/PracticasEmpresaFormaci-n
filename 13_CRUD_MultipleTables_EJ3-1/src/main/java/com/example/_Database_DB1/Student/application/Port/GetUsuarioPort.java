package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Student.domain.NotFoundException;
import com.example._Database_DB1.Student.domain.persona;

import java.util.List;

public interface GetUsuarioPort {
    public List<student> getAll();
    public persona getById(int id) throws NotFoundException;
    public List<persona> getByName(String name);
}
