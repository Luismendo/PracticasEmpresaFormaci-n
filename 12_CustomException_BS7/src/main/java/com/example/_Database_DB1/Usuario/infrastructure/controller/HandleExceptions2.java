package com.example._Database_DB1.Usuario.infrastructure.controller;


import com.example._Database_DB1.Usuario.domain.UnprocesableException;
import com.example._Database_DB1.Usuario.infrastructure.dto.output.CustomError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandleExceptions2 {
    @Autowired
    CustomError customError;

    @ExceptionHandler({ UnprocesableException.class})
    public CustomError handleExceptionUnproces() {

        return customError.UnprocesableException();
    }
}
