package com.Ford.Model;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@ToString
public class vehicleFeature
{
    @Field("Exterior")
    private exteriorFeature extFeatures;

    @Field("Interior")
    private interiorFeature intFeatures;

    public exteriorFeature getExtFeatures() {
        return extFeatures;
    }

    public void setExtFeatures(exteriorFeature extFeatures) {
        this.extFeatures = extFeatures;
    }

    public interiorFeature getIntFeatures() {
        return intFeatures;
    }

    public void setIntFeatures(interiorFeature intFeatures) {
        this.intFeatures = intFeatures;
    }
}
