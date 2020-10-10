package com.Ford.Model;

import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@ToString
public class exteriorFeature
{
    //如何注入更好？
    private HashSet<String> features;

    public HashSet<String> getFeatures() {
        return features;
    }

    public void setFeatures(HashSet<String> features) {
        this.features = features;
    }
}