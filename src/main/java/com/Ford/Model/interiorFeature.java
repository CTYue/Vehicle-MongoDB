package com.Ford.Model;

import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

//@Bean Bean not applicable by type???

@ToString
public class interiorFeature
{
    private HashSet<String> features;

    public HashSet<String> getFeatures() {
        return features;
    }

    public void setFeatures(HashSet<String> features) {
        this.features = features;
    }
}