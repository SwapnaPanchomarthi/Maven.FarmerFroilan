package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Produce;

public class Chicken extends Animal implements Produce {
    private Boolean hasBeenFertilized = false;
    Integer eggCount;

    private Chicken()
    {


    }

    public static Chicken createChicken() {
        return new Chicken();
    }

    public void setEggCount(Integer eggCount) {
        this.eggCount = eggCount;
    }

    public Integer getEggCount() {
        return eggCount;
    }


    public Boolean getHasBeenFertilized()
    {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public String makeNoise() {

        return "Cock-A-Doodle-Doo!";
    }

    public Edible yield()
    {   Edible edible = new Egg();


        return edible;
    }

    public String eat(Edible edible) {
        return null;
    }
}
