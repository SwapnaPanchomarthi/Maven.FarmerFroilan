package com.zipcodewilmington.froilansfarm.storage;

import java.util.ArrayList;

public class Farm {
    public ArrayList<Stable> stables;
    public ArrayList<ChickenCoop> chickenCoops;
    public FarmHouse farmHouse;

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse) {
        this.chickenCoops = chickenCoops;
        this.stables = stables;
        this.farmHouse = farmHouse;
    }
}
