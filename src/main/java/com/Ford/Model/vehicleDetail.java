package com.Ford.Model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class vehicleDetail
{
    private String make;
    private String model;
    private String modelYear;
    private String bodyStyle;
    private String engine;
    private String drivetype;
    private String color;
    private String MPG;
    private vehicleFeature vehicleFeature;
    private vehiclePrice[] vehiclePrice;

    public vehicleDetail(String make, String model, String modelYear, String bodyStyle, String engine, String drivetype, String color, String MPG, vehicleFeature vehicleFeature, vehiclePrice[] vehiclePrice)
    {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
        this.bodyStyle = bodyStyle;
        this.engine = engine;
        this.drivetype = drivetype;
        this.color = color;
        this.MPG = MPG;
        this.vehicleFeature = vehicleFeature;
        this.vehiclePrice = vehiclePrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDrivetype() {
        return drivetype;
    }

    public void setDrivetype(String drivetype) {
        this.drivetype = drivetype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public vehicleFeature getVehicleFeature() {
        return vehicleFeature;
    }

    public void setVehicleFeature(vehicleFeature vehicleFeature) {
        this.vehicleFeature = vehicleFeature;
    }

    public String getMPG() {
        return MPG;
    }

    public void setMPG(String MPG) {
        this.MPG = MPG;
    }

    public com.Ford.Model.vehiclePrice[] getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(com.Ford.Model.vehiclePrice[] vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

}