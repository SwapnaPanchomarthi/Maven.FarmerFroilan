package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    @Test
    public void TractorConstructor() {
        // Given
        Tractor tractor = new Tractor();
        // Then
        Assert.assertNotNull(tractor);
    }

    @Test
    public void makeNoiseTest() {
        // Given
        Tractor tractor = new Tractor();
        String expected = "operating tractor";
        // When
        String actual = tractor.makeNoise();
        // Then
        Assert.assertEquals(expected, actual);
    }
}
