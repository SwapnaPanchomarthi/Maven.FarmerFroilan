package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.util.Edible;

public class TomatoPlant extends Crop {

    public Edible yield() {
        return new Tomato();
    }
}
