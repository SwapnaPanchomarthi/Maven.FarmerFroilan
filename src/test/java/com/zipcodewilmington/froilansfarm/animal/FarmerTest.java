package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.util.Produce;
import com.zipcodewilmington.froilansfarm.util.Rideable;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    Farmer farmer =new Farmer();

    @Test
    public void plant() {
        Crop crop = new TomatoPlant();
        farmer.plant(crop);

        Assert.assertTrue(crop.isPlanted());
    }

    @Test
    public void mount() {
        //Given
        Rideable rideable = new Tractor();
        String expected = "Farmer mounted "+rideable;

        //When
       String actual= (farmer.mount(rideable)).toString();


        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dismount() {

        //Given
        Rideable rideable = new Tractor();
        String expected = "Farmer dismounted "+rideable;

        //When
        String actual= (farmer.dismount(rideable)).toString();


        //Then
        Assert.assertEquals(expected, actual);

    }

}