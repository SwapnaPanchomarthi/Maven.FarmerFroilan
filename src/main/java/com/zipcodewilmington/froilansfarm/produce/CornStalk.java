package com.zipcodewilmington.froilansfarm.produce;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CornStalk extends Crop {

    public CornStalk() {
    }

    public EarCorn yield() {
        return EarCorn.createEarCorn();
    }

    public static ArrayList<CornStalk> createCornStalks (int numberOfCornStalks){
        return (ArrayList<CornStalk>) Stream.generate(CornStalk::new)
                .limit(numberOfCornStalks)
                .collect(Collectors.toList());
    }
}
