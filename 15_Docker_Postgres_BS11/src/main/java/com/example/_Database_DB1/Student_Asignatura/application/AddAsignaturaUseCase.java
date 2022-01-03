package com.example._Database_DB1.Student_Asignatura.application;

import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student_Asignatura.application.Port.AddAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import com.example._Database_DB1.Student_Asignatura.domain.Student_AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddAsignaturaUseCase implements AddAsignaturaPort {
    @Autowired
    Student_AsignaturaRepositorio student_asignaturaRepositorio;

    public void AddUser(Student_Asignatura student_asignatura){
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL2");
        //System.out.println(student_asignatura);
        student_asignaturaRepositorio.save(student_asignatura);
    }

    public boolean validValues(Student_Asignatura student_asignatura) throws UnprocesableException {
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL");
        if (student_asignatura.getAsignatura()==null) {throw new UnprocesableException("Usuario no puede ser nulo"); }
        if(student_asignatura.getInitial_date()==null){throw new UnprocesableException("Profesor no puede ser estudiante"); }
        return true;
    }

    @Override
    public void createUsuario(Student_Asignatura student_asignatura) throws UnprocesableException {
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL0");
        if(validValues(student_asignatura)){
            AddUser(student_asignatura);
        }
    }
}
