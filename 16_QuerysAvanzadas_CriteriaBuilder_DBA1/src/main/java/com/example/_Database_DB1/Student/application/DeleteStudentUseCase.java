package com.example._Database_DB1.Student.application;

import com.example._Database_DB1.Persona.domain.NotFoundException;
import com.example._Database_DB1.Persona.domain.UnprocesableException;
import com.example._Database_DB1.Student.application.Port.DeleteStudentPort;
import com.example._Database_DB1.Student.domain.Student;
import com.example._Database_DB1.Student.domain.StudentRepositorio;
import com.example._Database_DB1.Student_Asignatura.domain.Student_Asignatura;
import com.example._Database_DB1.Student_Asignatura.domain.Student_AsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeleteStudentUseCase implements DeleteStudentPort {
    @Autowired
    StudentRepositorio studentRepositorio;


    @Override
    public void deleteById(String id) throws NotFoundException {
        if(studentRepositorio.findById(id).isPresent()){
            studentRepositorio.deleteById(id);
        }
    }


    @Autowired
    Student_AsignaturaRepositorio student_asignaturaRepositorio;

    @Override
    public void deleteAsigToUser(String id_student, List<String> listIdAsig) throws UnprocesableException {

        if(studentRepositorio.getById(id_student) != null){
            Student student = studentRepositorio.getById(id_student);
            List<Student_Asignatura> temp = new ArrayList<>();
            student.getStudent_asignaturaList().stream().forEach(elem ->
            {
                if(listIdAsig.contains(elem.getId_asignatura())){
                    //Student_Asignatura student_asignatura = student_asignaturaRepositorio.findById(elem.getId_asignatura()).get();
                    //student_asignatura.setStudent_asig(null);
                    //student_asignaturaRepositorio.save(student_asignatura)
                    //student.getStudent_asignaturaList().get(Integer.parseInt(elem.getId_asignatura()));
                    temp.add(elem);
                    //no funciona delete
                    //student_asignaturaRepositorio.deleteById(elem.getId_asignatura());
                }

            });

            temp.forEach(elem ->
            {
                student.getStudent_asignaturaList().remove(elem);
                studentRepositorio.save(student);
            });

        }
    }

}
