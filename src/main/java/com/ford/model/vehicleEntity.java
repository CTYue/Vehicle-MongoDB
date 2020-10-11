package com.ford.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
@Document(collection="vehicle_inventory")
public class vehicleEntity
{
    @Id
    private Integer vehicleId;
    private vehicleDetail vehicleDetails;

    public vehicleEntity(){}

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public vehicleDetail getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(vehicleDetail vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public vehicleEntity(Integer vehicleId, vehicleDetail vehicleDetails, String[] stringArray) {
        this.vehicleId = vehicleId;
        this.vehicleDetails = vehicleDetails;
    }
}