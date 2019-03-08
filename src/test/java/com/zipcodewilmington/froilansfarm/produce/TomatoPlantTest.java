package com.zipcodewilmington.froilansfarm.produce;

import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yield() {
        // Given
        TomatoPlant tomatoPlant = TomatoPlant.createTomatoPlant();
        // When
        Tomato actual = tomatoPlant.yield();
        // Then
        Assert.assertNotNull(actual);
    }
}
