package com.example._Database_DB1.Student_Asignatura.application;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Student_Asignatura.application.Port.GetAsignaturaPort;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import com.example._Database_DB1.Student_Asignatura.domain.Student_AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAsignaturaUseCase implements GetAsignaturaPort {
    @Autowired
    Student_AsignaturaRepositorio student_asignaturaRepositorio;


    public List<Student_Asignatura> getAll(){
        return student_asignaturaRepositorio.findAll();
    }


    @Override
    public Student_Asignatura getById(String id) throws NotFoundException {
        if(student_asignaturaRepositorio.findById(id).isPresent()){
            return student_asignaturaRepositorio.findById(id).get();
        }else {
            throw new NotFoundException("No existe el id");
        }
    }

    @Override
    public List<Student_Asignatura> getByIdStudent(String id_Student) {
        return student_asignaturaRepositorio.findByIdStudent(id_Student);
    }

    @Override
    public List<Student_Asignatura> getByName(String name) {
        return student_asignaturaRepositorio.findByName(name);
    }
}
