package com.zipcodewilmington.froilansfarm.storage;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {

    @Test
    public void constructorTest(){
        //Given
        Farm farm = new Farm(new ArrayList<Stable>(), new ArrayList<ChickenCoop>(), new FarmHouse());

        //Then
        Assert.assertNotNull(farm);
    }

}