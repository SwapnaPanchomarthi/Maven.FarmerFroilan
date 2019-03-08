package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.storage.CropRow;
import com.zipcodewilmington.froilansfarm.util.FarmVehicle;
import com.zipcodewilmington.froilansfarm.util.Rideable;

public class CropDuster extends Aircraft implements FarmVehicle {


    public CropDuster() {
    }

    public Boolean fertilize(CropRow cropRow) {
        return true;
    }

    public String fly() {
        return "flying cropduster";
    }



    public String ride(Rideable rideable) {
        return "riding cropduster";
    }


}