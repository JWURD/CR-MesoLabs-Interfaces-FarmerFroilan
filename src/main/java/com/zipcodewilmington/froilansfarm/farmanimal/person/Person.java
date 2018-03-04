package com.zipcodewilmington.froilansfarm.farmanimal.person;

import com.zipcodewilmington.froilansfarm.farmanimal.Animal;
import com.zipcodewilmington.froilansfarm.farmutilities.Rideable;

public abstract class Person extends Animal implements Rider {


    public Person(String name, int id) {
        super(name, id);
    }

    public Rideable mount(Rideable object) {
        return null;
    }

    public void dismount(Rideable object) {

    }

}
