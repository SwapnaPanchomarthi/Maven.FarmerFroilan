package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.Edible;
import com.zipcodewilmington.froilansfarm.produce.Tomato;

public class TomatoPlant extends Crop {

    public Edible yield() {
        return new Tomato();
    }
}
