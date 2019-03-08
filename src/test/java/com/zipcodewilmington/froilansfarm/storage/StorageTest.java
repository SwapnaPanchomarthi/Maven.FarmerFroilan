package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animal.Farmer;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.animal.Person;
import com.zipcodewilmington.froilansfarm.produce.Chicken;
import com.zipcodewilmington.froilansfarm.produce.CornStalk;
import com.zipcodewilmington.froilansfarm.produce.Crop;
import org.junit.Assert;
import org.junit.Test;

public class StorageTest {
    Stable stable;
    ChickenCoop chickenCoop;
    FarmHouse farmHouse;
    Field field;
    CropRow cropRow;
    Crop crop;
    Horse horse;
    Chicken chicken;
    Person person;

    @Test
    public void addHorseTest() {
        //Given
        this.stable = new Stable();
        this.horse = Horse.createHorse("Seabiscuit", 10);

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
        this.chicken = Chicken.createChicken(10);

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
        this.person = Farmer.createFarmer("Froilan", 10);

        //When
        farmHouse.add(person);
        Object actualPerson = farmHouse.get(0);

        //Then
        Object expectedPerson = person;
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void addFieldTest(){
        //Given
        this.field = new Field();
        this.cropRow = new CropRow();

        //When
        field.add(cropRow);
        Object actualCropRow = field.get(0);

        //Then
        Object expectedCropRow = cropRow;
        Assert.assertEquals(expectedCropRow, actualCropRow);
    }

    @Test
    public void addCropTest(){
        //Given
        this.cropRow = new CropRow();
        this.crop = CornStalk.createCornStalk();

        //When
        cropRow.add(crop);
        Object actualCrop = cropRow.get(0);

        //Then
        Object expectedCrop = crop;
        Assert.assertEquals(expectedCrop, actualCrop);
    }

    @Test
    public void removeHorseTest() {
        //Given
        this.stable = new Stable();
        this.horse = Horse.createHorse("Seabiscuit", 10);

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
        this.chicken = Chicken.createChicken(10);

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
        this.person = Farmer.createFarmer("Froilan", 10);

        //When
        farmHouse.add(person);
        Integer beforeRemove = farmHouse.getSize();
        farmHouse.remove(person);

        //Then
        Integer afterRemove = farmHouse.getSize();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }

    @Test
    public void removeCropRowTest(){
        //Given
        this.field = new Field();
        this.cropRow = new CropRow();

        //When
        field.add(cropRow);
        Integer beforeRemove = field.getSize();
        field.remove(cropRow);

        //Then
        Integer afterRemove = field.getSize();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }

    @Test
    public void removeCropTest(){
        //Given
        this.cropRow = new CropRow();
        this.crop = CornStalk.createCornStalk();

        //When
        cropRow.add(crop);
        Integer beforeRemove = cropRow.getSize();
        cropRow.remove(crop);

        //Then
        Integer afterRemove = cropRow.getSize();
        Assert.assertNotEquals(beforeRemove, afterRemove);
    }
}