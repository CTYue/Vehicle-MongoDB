/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.ford.exceptions;

/**
 * Defined the exception when no matching vehicle is found.
 */
public class VehicleNotFoundException extends RuntimeException
{
    public VehicleNotFoundException(String message)
    {
        super(message);
        System.out.println("Error: "+message);
    }
}
