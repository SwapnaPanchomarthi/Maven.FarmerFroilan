package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.util.Produce;

public abstract class Crop implements Produce {
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;
    Boolean planted;

    public void plant() {
        this.planted = true;
    }

    public boolean isPlanted() {
        return planted;
    }
}
