package com.zipcodewilmington.froilansfarm.farmvehicles;

public class CropDuster extends AirCraft implements FarmVehicle {
    boolean hasBeenFertilized;

    public CropDuster() {
        hasBeenFertilized = false;
    }

    public boolean operate() {
        //hasBeenFertilized = true;
        return false;
    }


}
