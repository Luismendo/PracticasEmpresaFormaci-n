package com.example._Database_DB1.Student.infrastructure.controller;

import com.example._Database_DB1.Student.domain.NotFoundException;
import com.example._Database_DB1.Student.domain.UnprocesableException;
import com.example._Database_DB1.Student.infrastructure.dto.output.CustomError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandleExceptions {
    @Autowired
    CustomError customError;

    @ExceptionHandler({ NotFoundException.class})
    public CustomError handleExceptionNotFound() {

        return customError.NotFoundException();
    }

    @ExceptionHandler({ UnprocesableException.class})
    public CustomError handleExceptionUnproces() {

        return customError.UnprocesableException();
    }

}
