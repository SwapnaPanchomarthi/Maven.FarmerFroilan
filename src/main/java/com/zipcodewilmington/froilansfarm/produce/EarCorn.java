package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.util.Edible;

public class EarCorn implements Edible {

    public static EarCorn createEarCorn() {
        return new EarCorn();
    }

    private EarCorn() {
    }
}
