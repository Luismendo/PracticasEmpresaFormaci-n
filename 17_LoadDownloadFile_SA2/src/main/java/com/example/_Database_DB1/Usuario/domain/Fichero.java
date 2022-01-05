package com.example._Database_DB1.Usuario.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Fichero {
    @Id
    @GeneratedValue
    private int id;


    private String fichero_name;
    private String metadata;

    @Temporal(TemporalType.DATE)
    private Date upload_date;
}
