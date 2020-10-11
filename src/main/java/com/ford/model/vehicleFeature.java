package com.Ford.Model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class vehicleFeature
{
    //vehicleFeature是一个sub-document
    private ExteriorFeatures Exterior;

    private InteriorFeatures Interior;

    public ExteriorFeatures getExterior() {
        return Exterior;
    }

    public void setExterior(ExteriorFeatures exterior) {
        Exterior = exterior;
    }

    public InteriorFeatures getInterior() {
        return Interior;
    }

    public void setInterior(InteriorFeatures interior) {
        Interior = interior;
    }

    public vehicleFeature(ExteriorFeatures exterior, InteriorFeatures interior) {
        Exterior = exterior;
        Interior = interior;
    }
}
