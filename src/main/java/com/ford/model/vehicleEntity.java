package com.Ford.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="vehicle_inventory")
public class VehicleEntity
{
    @Id
    private Integer vehicleId;
    private vehicleDetail vehicleDetails;

    public VehicleEntity(Integer vehicleId, vehicleDetail vehicleDetails)
    {
        this.vehicleId = vehicleId;
        this.vehicleDetails = vehicleDetails;
    }

    public Integer getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public vehicleDetail getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(vehicleDetail vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }
}