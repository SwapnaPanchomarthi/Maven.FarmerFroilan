package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Produce;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {


    @Test
    public void inheritanceTest() {

        Animal chicken = new Chicken(null);

        Assert.assertTrue(chicken instanceof Animal);

    }

     @Test
    public void implementationTest() {

        Produce chicken = (Produce) (Object)new Chicken(null);

        Assert.assertTrue(chicken instanceof Produce);
    }

    @Test
    public void eat() {
        //Given
        Chicken chicken = new Chicken( 10);
        Edible edible = new Egg();
        Integer expected = 20;
        //When
        chicken.eat(edible);
        Integer actual = chicken.getEggCount();

        //Then
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void makeNoise() {
        //Given
        Chicken chicken = new Chicken( 11);
        String expected = "Cock-A-Doodle-Doo!";

        //When
        String actual=  chicken.makeNoise();
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yield() {
    }

    @Test
    public void setEggCount() {

        //Given
        Chicken chicken = new Chicken( 10);


        //When
        chicken.setEggCount(10);
        Integer actual = chicken.getEggCount();

        //Then
        Integer expected = 10;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getEggCount() {
        //Given
        Chicken chicken = new Chicken( 11);
        Integer expected =11;
        //When
        Integer actual=  chicken.getEggCount();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getHasBeenFertilized() {
    }

    @Test
    public void setHasBeenFertilized() {
    }
}