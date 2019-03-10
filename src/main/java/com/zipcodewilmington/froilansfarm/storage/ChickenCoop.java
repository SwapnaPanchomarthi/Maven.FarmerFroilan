package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.produce.Chicken;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChickenCoop extends Storage<Chicken> {
    private ArrayList<Chicken> chickens;
    public ChickenCoop(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
}
