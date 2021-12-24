package com.example._Database_DB1.Usuario.infrastructure.dto.output;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import java.time.LocalTime;
import java.util.Date;

@Component
@Data
public class CustomError{
    Date timestamp;
    int HttpCode;
    String Message;


    public CustomError NotFoundException(){
        this.timestamp= new Date(System.currentTimeMillis());
        this.HttpCode = 404;
        this.Message = "NotFoundException";

        return this;

    }

    public CustomError UnprocesableException(){
        this.timestamp= new Date(System.currentTimeMillis());
        this.HttpCode = 422;
        this.Message = "UNPROCESSABLE ENTIT";

        return this;
    }
}
