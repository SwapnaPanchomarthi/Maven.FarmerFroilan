package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Produce;
import sun.rmi.server.InactiveGroupException;

public class Chicken extends Animal implements Produce {
    private Boolean hasBeenFertilized = false;
    Integer eggCount;

    public Chicken(Integer eggCount)
    {
        this.eggCount = eggCount;

    }

    public void setEggCount(Integer eggCount) {
        this.eggCount = eggCount;
    }

    public Integer getEggCount() {
        return eggCount;
    }


    public Boolean getHasBeenFertilized()
    {   if(eggCount!=0)
        hasBeenFertilized=true;
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }



    public void eat(Edible edible) {
        Integer numOfEggsConsumed = 10;
        this.eggCount=numOfEggsConsumed+eggCount;

    }

    public String makeNoise() {

        return "Cock-A-Doodle-Doo!";
    }

    public Edible yield()
    {   Edible edible = new Egg();


        return edible;
    }
}
