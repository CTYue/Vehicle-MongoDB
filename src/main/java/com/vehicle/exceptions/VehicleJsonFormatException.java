/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.vehicle.exceptions;

/**
 * Defined the exception for malformed Json.
 */
public class VehicleJsonFormatException extends RuntimeException
{
    public VehicleJsonFormatException(String message)
    {
        super(message);
        System.out.println("Error: "+message);
    }
}
