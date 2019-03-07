package com.zipcodewilmington.froilansfarm.produce;

public class CornStalk extends Crop {
    public Edible yield() {
        return new EarCorn();
    }
}
