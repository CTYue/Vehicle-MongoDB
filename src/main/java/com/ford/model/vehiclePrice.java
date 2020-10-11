package com.ford.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
public class vehiclePrice
{
    private String MSRP;
    private String Savings;
    private String finalPrice;

    public vehiclePrice(String MSRP, String Savings, String finalPrice) {
        this.MSRP = MSRP;
        this.Savings = Savings;
        this.finalPrice = finalPrice;
    }

    public String getMSRP() {
        return MSRP;
    }

    public void setMSRP(String MSRP) {
        this.MSRP = MSRP;
    }

    public String getSavings() {
        return Savings;
    }

    public void setSavings(String savings) {
        Savings = savings;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }
}
