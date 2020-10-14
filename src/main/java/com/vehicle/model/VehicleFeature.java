/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.vehicle.model;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * VehicleFeature sub-document
 */
public class VehicleFeature
{
    @Field("Exterior")
    private String[] exterior;

    @Field("Interior")
    private String[] interior;

    public String[] getExterior() {
        return exterior;
    }

    public void setExterior(String[] exterior) {
        this.exterior = exterior;
    }

    public String[] getInterior() {
        return interior;
    }

    public void setInterior(String[] interior) {
        this.interior = interior;
    }

    public VehicleFeature(String[] exterior, String[] interior) {
        this.exterior = exterior;
        this.interior = interior;
    }
}
