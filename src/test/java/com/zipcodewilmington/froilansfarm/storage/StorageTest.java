package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.animal.Person;
import com.zipcodewilmington.froilansfarm.produce.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class StorageTest {
    Stable stable;
    ChickenCoop chickenCoop;
    FarmHouse farmHouse;
    Horse horse;
    Chicken chicken;
    Person person;

    @Test
    public void addHorseTest() {
        //Given
        this.stable = new Stable();
        this.horse = new Horse("Seabiscuit", 10);

        //When
        stable.add(horse);
        Object actualHorse = stable.get(0);

        //Then
        Object expectedHorse = horse;
        Assert.assertEquals(expectedHorse, actualHorse);
    }

    @Test
    public void addChickenTest(){
        //Given
        this.chickenCoop = new ChickenCoop();
        this.chicken = new Chicken();

        //When
        chickenCoop.add(chicken);
        Object actualChicken = chickenCoop.get(0);

        //Then
        Object expectedChicken = chicken;
        Assert.assertEquals(expectedChicken, actualChicken);
    }

    @Test
    public void addFarmerTest(){
        //Given
        this.farmHouse = new FarmHouse();
        this.person = new Farmer();

        //When
        farmHouse.add(person);
        Object actualPerson = farmHouse.get(0);

        //When
        Object expectedPerson = person;
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void removeHorseTest() {
        //Given
        this.stable = new Stable();
        this.horse = new Horse("Seabiscuit", 10);

        //When
        stable.add(horse);
        Integer beforeRemove = stable.getSize();
        stable.remove(horse);

        //Then
        Integer afterRemove = stable.getSize();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }

    @Test
    public void removeChickenTest(){
        //Given
        this.chickenCoop = new ChickenCoop();
        this.chicken = new Chicken();

        //When
        chickenCoop.add(chicken);
        Integer beforeRemove = chickenCoop.getSize();
        chickenCoop.remove(chicken);

        //Then
        Integer afterRemove = chickenCoop.getSize();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }

    @Test
    public void removeFarmerTest(){
        //Given
        this.farmHouse = new FarmHouse();
        this.person = new Farmer();

        //When
        farmHouse.add(person);
        Integer beforeRemove = farmHouse.getSize();
        farmHouse.remove(person);

        //Then
        Integer afterRemove = farmHouse.getSize();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }
}