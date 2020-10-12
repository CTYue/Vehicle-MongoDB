/*
 * Copyright (c) 2020 [Z.D. Yu](http://github.com/CTYue)
 */

package com.ford.model;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * VehiclePrice sub-document
 */
public class VehiclePrice
{
    @Field("MSRP")
    private String msrp;

    @Field("Savings")
    private String savings;

    private String finalPrice;

    public VehiclePrice(String msrp, String savings, String finalPrice) {
        this.msrp = msrp;
        this.savings = savings;
        this.finalPrice = finalPrice;
    }

    public String getMsrp() {
        return msrp;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public String getSavings() {
        return savings;
    }

    public void setSavings(String savings) {
        this.savings = savings;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }
}
