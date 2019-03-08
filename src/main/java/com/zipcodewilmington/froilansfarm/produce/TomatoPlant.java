package com.zipcodewilmington.froilansfarm.produce;

public class TomatoPlant extends Crop {

    private TomatoPlant() {
    }

    public static TomatoPlant createTomatoPlant() {
        return new TomatoPlant();
    }

    public Tomato yield() {
        return Tomato.createTomato();
    }
}
