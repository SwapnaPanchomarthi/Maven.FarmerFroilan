package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.util.Edible;

public class CornStalk extends Crop {

    public EarCorn yield() {
        return new EarCorn();
    }
}
