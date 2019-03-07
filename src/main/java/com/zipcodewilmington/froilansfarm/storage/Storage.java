package com.zipcodewilmington.froilansfarm.storage;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage<SomeType> {
    List<SomeType> list = new ArrayList<SomeType>();

    void add(SomeType something) {
        list.add(something);
    }

    void remove(SomeType something) {
        list.remove(something);
    }

    SomeType get(Integer index) {
        return list.get(index);
    }

}
