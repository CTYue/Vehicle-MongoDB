/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.vehicle.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Main document for vehicle entities
 */

@Document(collection="vehicle_inventory")
public class VehicleEntity
{
    @Id
    private String vehicleId;
    private VehicleDetail vehicleDetails;

    public VehicleEntity(){}

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleDetail getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(VehicleDetail vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public VehicleEntity(String vehicleId, VehicleDetail vehicleDetails) {
        this.vehicleId = vehicleId;
        this.vehicleDetails = vehicleDetails;
    }
}