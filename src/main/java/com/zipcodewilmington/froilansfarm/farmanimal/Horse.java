package com.zipcodewilmington.froilansfarm.farmanimal;

import com.zipcodewilmington.froilansfarm.farmutilities.Edible;
import com.zipcodewilmington.froilansfarm.farmutilities.Rideable;

public class Horse extends Animal implements Rideable {

    public Horse(int id, String name) {
        super(name, id);
    }

    public String makeNoise() {
        return null;
    }

    public boolean isMounted() {
        return false;
    }
}
