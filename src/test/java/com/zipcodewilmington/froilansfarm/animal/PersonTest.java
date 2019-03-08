package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.produce.Tomato;
import com.zipcodewilmington.froilansfarm.util.Edible;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void makeNoiseTest() {
        // Given
        Person person = new Person() {
            @Override
            public String makeNoise() {
                return super.makeNoise();
            }
        };
        String actual = person.makeNoise();

        // Then
        Assert.assertNull(actual);
    }
}