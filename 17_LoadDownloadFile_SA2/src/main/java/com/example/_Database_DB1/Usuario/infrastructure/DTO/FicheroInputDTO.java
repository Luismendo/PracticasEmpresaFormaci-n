package com.example._Database_DB1.Usuario.infrastructure.DTO;

import com.example._Database_DB1.Usuario.domain.Fichero;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@Component
public class FicheroInputDTO {

    private String fichero_name;
    private String metadata;
    private Date upload_date;

    private String Dir = "files/";




    public Fichero Change(String fichero_name,String metadata) throws ParseException {
        Fichero fichero = new Fichero();

        fichero.setFichero_name(fichero_name);
        fichero.setMetadata(metadata);

        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        String date = dateTimeFormatter.format(now);
        System.out.println(date);
        System.out.println("==========================");
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);

        fichero.setUpload_date(date1);



        return fichero;
    }
}
