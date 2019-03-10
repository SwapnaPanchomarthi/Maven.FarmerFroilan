package com.zipcodewilmington.froilansfarm.storage;


import java.util.ArrayList;

public class Field extends Storage<CropRow> {
    private ArrayList<CropRow> cropRows;

    public Field(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }
}
