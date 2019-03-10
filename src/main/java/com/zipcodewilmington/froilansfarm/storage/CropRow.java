package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;

import java.util.List;

public class CropRow<T extends Crop> extends Storage {
    //private ArrayList<T> crops;

    public CropRow(List<T> crops) {
        super(crops);
    }
}
