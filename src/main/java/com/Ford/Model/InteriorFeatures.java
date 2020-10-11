package com.Ford.Model;


public class InteriorFeatures
{
    //One-to-Many <String>
//    private List<String> Interior;
//
//    public List<String> getInterior() {
//        return Interior;
//    }
//
//    public void setInterior(List<String> interior) {
//        Interior = interior;
//    }
//
//    public InteriorFeatures(List<String> interior) {
//        Interior = interior;
//    }

    private Something[] Interior;

    public Something[] getInterior() {
        return Interior;
    }

    public void setInterior(Something[] interior) {
        Interior = interior;
    }

    public InteriorFeatures(Something[] interior) {
        Interior = interior;
    }
}