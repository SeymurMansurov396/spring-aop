package com.seymur.controllers;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.seymur.exception.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Seymur on 6/5/2018.
 */

@ControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<Object> handleInvalidFormatException(InvalidFormatException ex){
        //return ResponseEntity.badRequest().body("Enter valid number");

        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(new Date().getTime());
        return new ResponseEntity<Object>(errorResponse, HttpStatus.valueOf(errorResponse.getErrorCode()));
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Object> handleNumberFormatException(NumberFormatException ex){
        ErrorResponse errorResponse=new ErrorResponse();
        errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setTimestamp(new Date().getTime());
        return new ResponseEntity<Object>(errorResponse, HttpStatus.valueOf(errorResponse.getErrorCode()));
    }


    public static  ErrorResponse proccesError(int code,String message,long t){
        return  null;
    }


}
