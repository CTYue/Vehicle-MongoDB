package com.ford.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
@Document(collection="vehicle_inventory")
public class VehicleEntity
{
    @Id
    private Integer vehicleId;
    private VehicleDetail vehicleDetails;

    public VehicleEntity(){}

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleDetail getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(VehicleDetail vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public VehicleEntity(Integer vehicleId, VehicleDetail vehicleDetails, String[] stringArray) {
        this.vehicleId = vehicleId;
        this.vehicleDetails = vehicleDetails;
    }
}