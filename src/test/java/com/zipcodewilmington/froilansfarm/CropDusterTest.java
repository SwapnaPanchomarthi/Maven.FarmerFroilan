package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void CropDusterConstructorTest() {
        // Given
        CropDuster cropDuster = new CropDuster();
        // Then
        Assert.assertNotNull(cropDuster);
    }

    @Test
    public void fertilizeTest() {
        // Given
        CropDuster cropDuster = new CropDuster();
        // When
        Boolean fertilized = cropDuster.fertilize();
        // Then
        Assert.assertTrue(fertilized);
    }

    @Test
    public void fly() {
        // Given
        CropDuster cropDuster = new CropDuster();
        String expected = "operating cropduster";
        // When
        String actual = cropDuster.fly();
        // Then
        Assert.assertEquals(expected, actual);
    }
}
