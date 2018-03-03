package com.zipcodewilmington.froilansfarm.farmstructures;

import com.zipcodewilmington.froilansfarm.farmanimal.person.Person;

import java.util.ArrayList;

public class FarmHouse {
    protected ArrayList<Person> farmers;
    public FarmHouse(){
        this.farmers = new ArrayList<Person>();
    }
    public boolean add(Person person) {
        return false;
    }

    public boolean remove(Person person) {
        return false;
    }

    public ArrayList<Person> getChickens() {
        return this.farmers;
    }

}
