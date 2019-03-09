package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.produce.Chicken;

import java.util.ArrayList;

public class Farm {
    public ArrayList<Stable> stables;
    public ArrayList<ChickenCoop> chickenCoops;
    public FarmHouse farmHouse;
    public ChickenCoop chickenCoop;

    public Farm(ArrayList<Stable> stables, ArrayList<ChickenCoop> chickenCoops, FarmHouse farmHouse) {
        this.chickenCoops = chickenCoops;
        this.stables = stables;
        this.farmHouse = farmHouse;
    }

    public ChickenCoop fullChickenCoop(int numberOfChickens) {
        for (int i =0; i<= numberOfChickens; i++) {
               this.chickenCoop.add(Chicken.createChicken());
        }
        return this.chickenCoop;
    }

    // TODO add to chicken coop arraylist
}
