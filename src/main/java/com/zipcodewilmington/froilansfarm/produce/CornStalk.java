package com.zipcodewilmington.froilansfarm.produce;

public class CornStalk extends Crop {

    public static CornStalk createCornStalk() {
        return new CornStalk();
    }

    private CornStalk() {
    }

    public EarCorn yield() {
        return EarCorn.createEarCorn();
    }
}
