package com.zipcodewilmington.froilansfarm.produce;

import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {
    @Test
    public void TomatoConstructorTest() {
        // Given
        Tomato tomato = Tomato.createTomato();
        // Then
        Assert.assertNotNull(tomato);
    }
}
