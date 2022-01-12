package com.example._Database_DB1.Student.infrastructure.dto.output;


import com.example._Database_DB1.Student.domain.Student;
import lombok.Data;
import org.javatuples.Pair;
import org.springframework.stereotype.Component;

import java.util.*;

@Data
@Component
public class FullStudentOutputDTO {
    private String id;
    private String branch;
    private String Comments;
    private int Num_hours_week;

    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String company_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String imagen_url;
    private Date termination_date;

    //private Pair<Integer, String> mi_profe;
    private Map<Integer, String> mi_profe = new HashMap<Integer, String>();
    private List<String> mis_asignaturas = new ArrayList<>();

    public FullStudentOutputDTO() {
    }

    public FullStudentOutputDTO(Student student) {
        this.setId(student.getId_student());
        this.setBranch(student.getBranch());
        this.setComments(student.getComments());
        this.setNum_hours_week(student.getNum_hours_week());


        this.setUsuario(student.getPersona_student().getUsuario());
        this.setPassword(student.getPersona_student().getPassword());
        this.setName(student.getPersona_student().getName());
        this.setSurname(student.getPersona_student().getSurname());
        this.setCompany_email(student.getPersona_student().getCompany_email());
        this.setPersonal_email(student.getPersona_student().getPersonal_email());
        this.setCity(student.getPersona_student().getCity());
        this.setActive(student.getPersona_student().getActive());
        this.setCreated_date(student.getPersona_student().getCreated_date());
        this.setImagen_url(student.getPersona_student().getImagen_url());
        this.setTermination_date(student.getPersona_student().getTermination_date());
        student.getMi_profesor().getStudentList();

        if(student.getMi_profesor() != null){

            this.mi_profe.put(Integer.parseInt(student.getMi_profesor().getId_profesor()),student.getMi_profesor().getPersona_profesor().getName());
        }

        if(student.getStudent_asignaturaList() != null){
            student.getStudent_asignaturaList().stream().forEach(elem ->{
                this.mis_asignaturas.add(elem.getAsignatura());
            });
        }

    }

}
