package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.util.Rideable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AircraftTest {


    @Test
    public void makeNoiseTest() {
        // Given
        Aircraft aircraft = new Aircraft() {
            public String ride(Rideable rideable) {
                return null;
            }
        };
        String actual = aircraft.makeNoise();
        // Then
        Assert.assertNull(actual);
    }
}