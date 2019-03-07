package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.vehicle.NoiseMaker;
import com.zipcodewilmington.froilansfarm.produce.Edible;

public abstract class Person extends Animal implements NoiseMaker, Eater {
    public String makeNoise() {
        return null;
    }

    public void eat(Edible edible) {
    }
}
