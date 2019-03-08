package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Rideable;

public class Horse extends Animal implements Rideable {
    String name;
    Integer energy;

    private Horse(String name, Integer energy){
        this.name = name;
        this.energy = energy;
    }

    public static Horse createHorse(String name, Integer energy) {
        return new Horse(name, energy);
    }

    public String eat(Edible edible) {
        this.energy += 10;
        return name + " ate " + edible;
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