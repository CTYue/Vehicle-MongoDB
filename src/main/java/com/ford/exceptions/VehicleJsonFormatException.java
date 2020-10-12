/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.ford.exceptions;

public class VehicleJsonFormatException extends RuntimeException
{
    public VehicleJsonFormatException(String message)
    {
        super(message);
        System.out.println("Error: "+message);
    }
}
