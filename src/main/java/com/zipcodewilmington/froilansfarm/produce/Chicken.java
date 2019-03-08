package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Produce;

public class Chicken extends Animal implements Produce {
    private Boolean hasBeenFertilized = false;

    public void eat(Edible edible) {

    }

    public String makeNoise() {

        return null;
    }

    public Edible yield() {
        return null;
    }
}
