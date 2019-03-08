package com.zipcodewilmington.froilansfarm.util;

public interface Produce {
    <T extends Edible>T yield();
}
