package com.zipcodewilmington.froilansfarm.farmanimal.Person;

import com.zipcodewilmington.froilansfarm.farmanimal.Animal;
import com.zipcodewilmington.froilansfarm.farmutilities.Edible;
import com.zipcodewilmington.froilansfarm.farmutilities.Rideable;

public abstract class Person extends Animal implements Rider {


    public Person(int id, String name) {
        super(id, name);
    }

    public Rideable mount(Rideable object) {
        return null;
    }

    public void dismount(Rideable object) {

    }

}
