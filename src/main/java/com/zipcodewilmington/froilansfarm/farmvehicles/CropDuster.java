package com.zipcodewilmington.froilansfarm.farmvehicles;

public class CropDuster extends AirCraft implements FarmVehicle {


    public CropDuster(String vehicleType) {
        super(vehicleType);

    }


    public boolean operate() {
        //hasBeenFertilized = true;
        return false;
    }


    public boolean isCurrentlyOperating(Vehicle farmMachine) {
        return false;
    }

    public void opperate() {

    }
}
