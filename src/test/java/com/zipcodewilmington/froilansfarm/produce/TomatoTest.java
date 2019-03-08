package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.produce.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {
    @Test
    public void TomatoConstructorTest() {
        // Given
        Tomato tomato = new Tomato();
        // Then
        Assert.assertNotNull(tomato);
    }
}
