package com.example._Database_DB1.Student.application;

import com.example._Database_DB1.Student.application.Port.AddStudentPort;
import com.example._Database_DB1.Student.domain.StudentRepositorio;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.domain.Student;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import com.example._Database_DB1.Student_Asignatura.domain.Student_AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AddStudentUseCase implements AddStudentPort {
    @Autowired
    StudentRepositorio studentRepositorio;

    public void AddUser(Student student){
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL2");
        studentRepositorio.save(student);
    }

    public boolean validValues(Student student) throws UnprocesableException {
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL");
        if(student.getBranch()==null) {throw new UnprocesableException("Usuario no puede ser nulo"); }
        if(student.getPersona_student().getProfesor() != null){throw new UnprocesableException("Studient no puede ser profesor"); }

        return true;
    }

    @Override
    public void createUsuario(Student student) throws UnprocesableException {
        System.out.println("LOOOOOOOOOOOOOOOOOOOOOOOL0");
        if(validValues(student)){
            AddUser(student);
        }
    }



    @Autowired
    Student_AsignaturaRepositorio student_asignaturaRepositorio;

    @Override
    public void AddAsigToUser(String id_student, List<String> listIdAsig) throws UnprocesableException {

        if(studentRepositorio.getById(id_student) != null){
            Student student = studentRepositorio.getById(id_student);
            List<Student_Asignatura> student_asignaturaList = new ArrayList<>();
            listIdAsig.stream().forEach(elem ->
            {
                if(student_asignaturaRepositorio.findById(String.valueOf(elem)).get() != null){
                    student_asignaturaList.add(student_asignaturaRepositorio.findById(String.valueOf(elem)).get());
                }

            });

            student.setStudent_asignaturaList(student_asignaturaList);
            studentRepositorio.save(student);
        }
    }
}
