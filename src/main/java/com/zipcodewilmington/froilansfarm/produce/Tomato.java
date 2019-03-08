package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.util.Edible;

public class Tomato implements Edible {
    private Tomato() {
    }

    public static Tomato createTomato() {
        return new Tomato();
    }
}
