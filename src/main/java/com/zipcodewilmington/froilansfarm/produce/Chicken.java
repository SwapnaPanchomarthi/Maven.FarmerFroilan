package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.animal.Animal;

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
