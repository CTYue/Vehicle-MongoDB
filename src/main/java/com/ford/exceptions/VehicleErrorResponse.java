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

    /**
     * Instantiates a new Vehicle error response.
     */
    public VehicleErrorResponse(){}

    /**
     * Instantiates a new Vehicle error response.
     *
     * @param status     the status
     * @param statusCode the status code
     * @param message    the message
     */
    public VehicleErrorResponse(String status, int statusCode, String message) {
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets status code.
     *
     * @return the status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets status code.
     *
     * @param statusCode the status code
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
