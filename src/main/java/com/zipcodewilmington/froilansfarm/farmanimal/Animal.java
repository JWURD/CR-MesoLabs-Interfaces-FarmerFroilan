package com.zipcodewilmington.froilansfarm.farmanimal;

import com.zipcodewilmington.froilansfarm.farmutilities.NoiseMaker;

public abstract class Animal<T> implements Eater, NoiseMaker {
    private final int id;
    private final String name;

    protected Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName(){
        return null;
    }

    public int getId(){
        return 0;
    }

}
