/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.vehicle.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Bind Java Exception to HTTP Responses, so both back-end
 * and front-end get the same error message.
 */
@ControllerAdvice
public class VehicleExceptionHandler {
    /**
     * Bind VehicleNotFoundException with corresponding HTTP Error Response.
     *
     * @param ex
     * @return the response entity
     */
    @ExceptionHandler
    public ResponseEntity<VehicleErrorResponse> handleException(VehicleNotFoundException ex){
        VehicleErrorResponse responseBody = new VehicleErrorResponse();

        responseBody.setMessage(ex.getMessage());
        responseBody.setStatusCode(HttpStatus.NOT_FOUND.value());
        responseBody.setStatus(HttpStatus.NOT_FOUND.toString());

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

    /**
     * Bind VehicleJsonFormatException with corresponding HTTP Error Response.
     *
     * @param ex the ex
     * @return the response entity
     */
    @ExceptionHandler
    public ResponseEntity<VehicleErrorResponse> handleException(VehicleJsonFormatException ex){
        VehicleErrorResponse responseBody = new VehicleErrorResponse();

        responseBody.setMessage(ex.getMessage());
        responseBody.setStatusCode(HttpStatus.NOT_FOUND.value());
        responseBody.setStatus(HttpStatus.NOT_FOUND.toString());

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

    /**
     * Bind other kind of exceptions with HTTP Error Response.
     *
     * @param ex the ex
     * @return the response entity
     */
    @ExceptionHandler
    public ResponseEntity<VehicleErrorResponse> handleException(RuntimeException ex){
        VehicleErrorResponse responseBody = new VehicleErrorResponse();

        responseBody.setMessage(ex.getMessage());
        responseBody.setStatusCode(HttpStatus.NOT_FOUND.value());
        responseBody.setStatus(HttpStatus.NOT_FOUND.toString());

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }
}
