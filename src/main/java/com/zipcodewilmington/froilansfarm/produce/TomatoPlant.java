package com.zipcodewilmington.froilansfarm.produce;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TomatoPlant extends Crop {

    public TomatoPlant() {
    }

    public static TomatoPlant createTomatoPlant() {
        return new TomatoPlant();
    }

    public Tomato yield() {
        return Tomato.createTomato();
    }

    public static ArrayList<TomatoPlant> createTomatoPlants (int numberOfTomatoPlants){
        return (ArrayList<TomatoPlant>) Stream.generate(TomatoPlant::new)
                .limit(numberOfTomatoPlants)
                .collect(Collectors.toList());
    }
}
