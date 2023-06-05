package com.example.demo.exception;

import com.example.demo.Response.Model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepNotFoundException.class)
    public ResponseEntity<ErrorMessage> deptNotFoundException(DepNotFoundException exception,
                                                WebRequest request){

        ErrorMessage msg = new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(msg);
    }

}
