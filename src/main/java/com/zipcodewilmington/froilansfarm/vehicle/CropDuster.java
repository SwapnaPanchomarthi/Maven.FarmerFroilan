package com.zipcodewilmington.froilansfarm.vehicle;

public class CropDuster extends Aircraft implements FarmVehicle{

    public CropDuster() {
    }

    public Boolean fertilize() {
        return true;
    }

    public String fly() {
        return "operating cropduster";
    }
}
