package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.util.Botanist;
import com.zipcodewilmington.froilansfarm.util.Rideable;
import com.zipcodewilmington.froilansfarm.util.Rider;

public class Farmer extends Person implements Rider, Botanist {

    public void plant(Crop crop) {
        crop.plant();

    }

    public String mount(Rideable rideable) {

     return "Farmer mounted "+rideable;

    }

    public String dismount(Rideable rideable) {
        return "Farmer dismounted "+rideable;

    }
}
