package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Rideable;

public class Horse extends Animal implements Rideable {
    String name;
    Integer energy;

    public Horse(String name, Integer energy){
        this.name = name;
        this.energy = energy;
    }

    public void eat(Edible edible) {
        this.energy += 10;
    }

    public String makeNoise() {
        return "Neigh!";
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getEnergy() {
        return this.energy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String ride(Rideable rideable) {
        this.energy -= 5;
        return "You rode" + this.getName();
    }
}