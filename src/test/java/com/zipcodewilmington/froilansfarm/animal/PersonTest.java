package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.produce.Egg;
import org.junit.Assert;
import org.junit.Test;

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

    @Test
    public void eatTest(){
        //Given
        Person person = Farmer.createFarmer(null, 10);
        Egg egg = new Egg();

        //When
        String actual = person.eat(egg);

        //Then
        String expected = null + " ate " + egg;
        Assert.assertEquals(expected, actual);
    }
}