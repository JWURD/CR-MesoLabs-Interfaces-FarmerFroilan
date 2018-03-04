package com.zipcodewilmington.froilansfarm.farmstructures;

import com.zipcodewilmington.froilansfarm.farmfields.Field;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm<E> {
    private String name;
    private ArrayList<Stable> hourseStables;
    private ArrayList<Field> cropFields;
    private ArrayList<ChickenCoop> chickenCoops;
    private FarmHouse theHouse;

    private HashMap<String, ArrayList<E>> allThingsOntheFarm;

   public Farm(String name){
       this.name = name;
       allThingsOntheFarm = new HashMap<String, ArrayList<E>>();
   }
   // creates a new map of the things on the farm where string
   public void add(String key, ArrayList<E> listType){
      // allThingsOntheFarm.put(key, listType);
   }
}

/**
 * private Map<String,ArrayList<E>
 */
