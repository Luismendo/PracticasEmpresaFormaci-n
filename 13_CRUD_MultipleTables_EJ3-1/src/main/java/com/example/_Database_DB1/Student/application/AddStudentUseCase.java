package com.example._Database_DB1.Student.application;

import com.example._Database_DB1.Student.application.Port.AddStudentPort;
import com.example._Database_DB1.Student.domain.StudentRepositorio;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddStudentUseCase implements AddStudentPort {
    @Autowired
    StudentRepositorio studentRepositorio;

    public void AddUser(Student student){
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL2");
        System.out.println(student);
        studentRepositorio.save(student);
    }

    public boolean validValues(Student student) throws UnprocesableException {
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL");
        if (student.getBranch()==null) {throw new UnprocesableException("Usuario no puede ser nulo"); }
        return true;
    }

    @Override
    public void createUsuario(Student student) throws UnprocesableException {
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL0");
        if(validValues(student)){
            AddUser(student);
        }
    }
}
