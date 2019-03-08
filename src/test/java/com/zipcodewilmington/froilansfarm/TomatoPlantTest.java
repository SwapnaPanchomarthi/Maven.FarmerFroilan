package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.produce.Edible;
import com.zipcodewilmington.froilansfarm.produce.Tomato;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yield() {
        // Given
        TomatoPlant tomatoPlant = new TomatoPlant();
        Tomato expected = new Tomato();
        // When
        Edible actual = tomatoPlant.yield();
        // Then
        Assert.assertTrue(actual instanceof Tomato);
    }
}
