package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.util.Edible;
import com.zipcodewilmington.froilansfarm.util.Produce;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {


    @Test
    public void inheritanceTest() {

        Animal chicken = Chicken.createChicken();

        Assert.assertTrue(chicken instanceof Animal);

    }

     @Test
    public void implementationTest() {

        Produce chicken = (Produce) (Object) Chicken.createChicken();

        Assert.assertTrue(chicken instanceof Produce);
    }

    //@Test
    public void eat() {
        //Given
        Chicken chicken = Chicken.createChicken( );
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
        Chicken chicken = Chicken.createChicken( );
        String expected = "Cock-A-Doodle-Doo!";

        //When
        String actual=  chicken.makeNoise();
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yield() {
        //Given
        Chicken chicken = Chicken.createChicken( );


        //When
        Integer expected =15;
        chicken.yield();
        Integer actualYield = chicken.getEggCount();

        //Then
        Assert.assertEquals(expected, actualYield);


    }

    @Test
    public void setEggCount() {

        //Given
        Chicken chicken = Chicken.createChicken( );


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
        Chicken chicken = Chicken.createChicken( );
        Integer expected =11;
        //When
        Integer actual=  chicken.getEggCount();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getHasBeenFertilizedTrue() {

        //Given
        Chicken chicken = Chicken.createChicken( );

        //When
            chicken.setHasBeenFertilized(true);
       boolean actual= chicken.getHasBeenFertilized();

        //Then

        Assert.assertTrue(actual);
        System.out.println(actual);

    }

    @Test
    public void getHasBeenFertilizedFalse() {

        //Given
        Chicken chicken = Chicken.createChicken( );

        //When
        chicken.setHasBeenFertilized(false);
        boolean actual= chicken.getHasBeenFertilized();

        //Then

        Assert.assertFalse(actual);
        System.out.println(actual);

    }
    @Test
    public void setHasBeenFertilized() {
        //Given
        Chicken chicken = Chicken.createChicken( );

        //When
        chicken.setHasBeenFertilized(true);
        boolean actual= chicken.getHasBeenFertilized();

        //Then

        Assert.assertTrue(actual);
        System.out.println(actual);

    }
}