package com.zipcodewilmington.froilansfarm.storage;

import java.util.ArrayList;

public class Farm {
    public ArrayList<Stable> stable;
    public ArrayList<ChickenCoop> chickenCoops;
    public FarmHouse farmHouse;

    public Farm(ArrayList<Stable> stable, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse) {
        this.chickenCoops = chickenCoops;
        this.stable = stable;
        this.farmHouse = farmHouse;
    }
}
