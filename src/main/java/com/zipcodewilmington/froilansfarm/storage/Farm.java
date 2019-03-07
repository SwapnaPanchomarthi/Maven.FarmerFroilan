package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.animal.Person;
import com.zipcodewilmington.froilansfarm.produce.Chicken;

import java.util.ArrayList;

public class Farm {
private ArrayList<Horse> stable;
private ArrayList<Chicken> chickenCoops;
private FarmHouse farmHouse;

    public Farm(ArrayList<Horse> stable, ArrayList<Chicken> chickenCoops, FarmHouse farmHouse) {
        this.chickenCoops = chickenCoops;
        this.stable = stable;
        this.farmHouse = farmHouse;
    }
}
