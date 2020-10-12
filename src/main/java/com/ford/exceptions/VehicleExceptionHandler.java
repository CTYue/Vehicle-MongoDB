/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.ford.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class VehicleExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<VehicleErrorResponse> handleException(VehicleNotFoundException ex){
        VehicleErrorResponse responseBody = new VehicleErrorResponse();

        responseBody.setMessage(ex.getMessage());
        responseBody.setStatusCode(HttpStatus.NOT_FOUND.value());
        responseBody.setStatus(HttpStatus.NOT_FOUND.toString());

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<VehicleErrorResponse> handleException(VehicleJsonFormatException ex){
        VehicleErrorResponse responseBody = new VehicleErrorResponse();

        responseBody.setMessage(ex.getMessage());
        responseBody.setStatusCode(HttpStatus.NOT_FOUND.value());
        responseBody.setStatus(HttpStatus.NOT_FOUND.toString());

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<VehicleErrorResponse> handleException(RuntimeException ex){
        VehicleErrorResponse responseBody = new VehicleErrorResponse();

        responseBody.setMessage(ex.getMessage());
        responseBody.setStatusCode(HttpStatus.NOT_FOUND.value());
        responseBody.setStatus(HttpStatus.NOT_FOUND.toString());

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }
}
