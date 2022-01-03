package com.example._Database_DB1.Persona.infrastructure.dto.output;

import lombok.Data;
import org.springframework.stereotype.Component;

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
