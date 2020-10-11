package com.Ford.Model;

import java.util.*;

public class ExteriorFeatures
{
//    //One-to-Many <String>
//    private List<String> Exterior;
//
//    public List<String> getExterior() {
//        return Exterior;
//    }
//
//    public void setExterior(List<String> exterior) {
//        Exterior = exterior;
//    }
//
//    public ExteriorFeatures(List<String> exterior) {
//        Exterior = exterior;
//    }

    public Something[] getExterior() {
        return Exterior;
    }

    public void setExterior(Something[] exterior) {
        Exterior = exterior;
    }

    public ExteriorFeatures(Something[] exterior) {
        Exterior = exterior;
    }

    private Something[] Exterior;

}
