package com.Ford.Model;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="vehicle_inventory")
@ToString
public class VehicleEntity
{
    //这里的ToString如何重写？

    @Id
    private Integer vehicleId;

    @PersistenceConstructor
    public VehicleEntity(Integer vehicleId, vehicleDetail vDetail) {
        this.vehicleId = vehicleId;
        this.vDetail = vDetail;
    }

    public Integer getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    @Field("vehicleDetails")
    private vehicleDetail vDetail;

    public vehicleDetail getvDetail() {
        return vDetail;
    }

    public void setvDetail(vehicleDetail vDetail) {
        this.vDetail = vDetail;
    }
}