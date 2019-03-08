package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.util.Fly;
import com.zipcodewilmington.froilansfarm.util.Vehicle;

public abstract class Aircraft implements Fly, Vehicle {

    public String makeNoise() {
        return null;
    }
}
