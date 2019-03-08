package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.produce.Tomato;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yield() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();
        // When
        Tomato actual = tomatoPlant.yield();
        // Then
        Assert.assertNotNull(actual);
    }
}
