package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.produce.Chicken;
import com.zipcodewilmington.froilansfarm.util.Vehicle;
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

    @Test
    public void generateChickenCoopsWithChickensTest() {
        // Given
        this.farm = new Farm(this.stables, this.chickenCoops, this.farmHouse);
        // When
        ArrayList<ChickenCoop> chickenCoops = farm.generateChickenCoopsWithChickens();
        Integer actual = chickenCoops.size();
        Integer expected = 4;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateStablesWithHorsesTest() {
        // Given
        this.farm = new Farm(this.stables, this.chickenCoops, this.farmHouse);
        // When
        ArrayList<Stable> stables = farm.generateStablesWithHorses();
        Integer actual = stables.size();
        Integer expected = 3;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateVehiclesTest() {
        // Given
        this.farm = new Farm(this.stables, this.chickenCoops, this.farmHouse);
        // When
        ArrayList<Vehicle> vehicles = farm.generateVehicles();
        Integer actual = vehicles.size();
        Integer expected = 3;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generatePersonsTest() {
        // Given
        this.farm = new Farm(this.stables, this.chickenCoops, this.farmHouse);
        // When
        ArrayList<Farmer> farmers = farm.generatePersons();
        Integer actual = farmers.size();
        Integer expected = 2;

        // Then
        Assert.assertEquals(expected, actual);
    }


}