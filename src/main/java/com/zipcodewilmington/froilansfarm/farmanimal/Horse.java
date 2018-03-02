package com.zipcodewilmington.froilansfarm.farmanimal;

import com.zipcodewilmington.froilansfarm.farmutilities.Rideable;

public class Horse extends Animal implements Rideable {

    protected Horse(int id, String name) {
        super(id, name);
    }

    public void eat(Edible theEddible) {

    }

    public String makeNoise() {
        return null;
    }
}
