package com.example._Database_DB1.Student.application;

import com.example._Database_DB1.Student.application.Port.AddStudentPort;
import com.example._Database_DB1.Student.domain.StudentRepositorio;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddStudentUseCase implements AddStudentPort {
    @Autowired
    StudentRepositorio studentRepositorio;

    public void AddUser(student persona){
        studentRepositorio.save(persona);
    }

    public boolean validValues(student student) throws UnprocesableException {
        if (student.getBranch()==null) {throw new UnprocesableException("Usuario no puede ser nulo"); }
        if (student.getComments().length()>10) { throw new UnprocesableException("Longitud de usuario no puede ser superior a 10 caracteres");}

        return true;
    }

    @Override
    public void createUsuario(student student) throws UnprocesableException {
        if(validValues(student)){
            AddUser(student);
        }
    }
}
