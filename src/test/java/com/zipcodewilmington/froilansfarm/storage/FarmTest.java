package com.zipcodewilmington.froilansfarm.storage;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {
    Farm farm;
    ArrayList<Stable> stables;
    ArrayList<ChickenCoop> chickenCoops;
    FarmHouse farmHouse;

    @Test
    public void constructorTest(){
        //Given
        this.farm = new Farm(this.stables, this.chickenCoops, this.farmHouse);

        //Then
        Assert.assertNotNull(farm);
    }
}