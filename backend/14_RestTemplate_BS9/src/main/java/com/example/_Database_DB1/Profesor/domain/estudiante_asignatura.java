package com.example._Database_DB1.Profesor.domain;/*
package com.example._Database_DB1.Student.domain;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Student_Asignatura {
    @Id
    @GeneratedValue
    @Column(name = "ID_ASIGNATURA")
    private String id_asignatura;
    @NotNull
    private String asignatura;
    @NotNull
    private String coments;
    @NotNull
    private Date initial_date;

    @Temporal(TemporalType.DATE)
    @NotNull
    private Date init_date;
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date finish_date;


    private String id_persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STUDENT")
    private com.example._Database_DB1.Student.domain.Student Student;

    @OneToOne(mappedBy = "id_profesor")
    private com.example._Database_DB1.Student.domain.Profesor Profesor;

}
*/
