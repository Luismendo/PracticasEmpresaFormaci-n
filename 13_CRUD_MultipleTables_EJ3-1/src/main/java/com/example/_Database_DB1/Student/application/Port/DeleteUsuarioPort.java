package com.example._Database_DB1.Student.application.Port;

import com.example._Database_DB1.Student.domain.NotFoundException;

public interface DeleteUsuarioPort {
    public void deleteById(int id) throws NotFoundException;
}
