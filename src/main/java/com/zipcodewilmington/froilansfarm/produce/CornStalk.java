package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.util.Edible;

public class CornStalk extends Crop {

    public Edible yield() {
        return new EarCorn();
    }
}
