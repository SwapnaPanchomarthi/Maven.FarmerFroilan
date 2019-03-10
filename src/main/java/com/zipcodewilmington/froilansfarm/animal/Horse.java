package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.produce.Chicken;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Rideable;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Horse extends Animal implements Rideable {
    String name;
    Integer energy;

    public Horse(String name, Integer energy){
        this.name = name;
        this.energy = energy;
    }

    public Horse() {
    }

    public static ArrayList<Horse> horsesArrayList(Integer numberOfHorses) {
        return (ArrayList<Horse>) Stream.generate(Horse::new)
                .limit(numberOfHorses)
                .collect(Collectors.toList());
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