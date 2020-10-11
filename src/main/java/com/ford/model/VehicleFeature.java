package com.ford.model;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
public class VehicleFeature
{
    private String[] Exterior;

    private String[] Interior;

    public String[] getExterior() {
        return Exterior;
    }

    public void setExterior(String[] exterior) {
        Exterior = exterior;
    }

    public String[] getInterior() {
        return Interior;
    }

    public void setInterior(String[] interior) {
        Interior = interior;
    }

    public VehicleFeature(String[] exterior, String[] interior) {
        Exterior = exterior;
        Interior = interior;
    }
}
