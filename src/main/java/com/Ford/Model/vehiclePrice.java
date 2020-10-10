package com.Ford.Model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
public class vehiclePrice
{
    private Integer MSRP;
    private Integer Savings;
    private Integer finalPrice;

    public Integer getMSRP() {
        return MSRP;
    }

    public void setMSRP(Integer MSRP) {
        this.MSRP = MSRP;
    }

    public Integer getSavings() {
        return Savings;
    }

    public void setSavings(Integer savings) {
        Savings = savings;
    }

    public Integer getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Integer finalPrice) {
        this.finalPrice = finalPrice;
    }
}
