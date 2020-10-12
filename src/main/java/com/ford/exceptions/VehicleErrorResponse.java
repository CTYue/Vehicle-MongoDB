/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.ford.exceptions;

/**
 * This class provides HTTP Response blabla.
 */
public class VehicleErrorResponse {
    private String status;
    private int statusCode;
    private String message;

    public VehicleErrorResponse(){}

    /**
     * Instantiates a new Vehicle error response.
     *
     * @param status     Http status
     * @param statusCode Http status code
     * @param message    Response message
     */
    public VehicleErrorResponse(String status, int statusCode, String message) {
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
