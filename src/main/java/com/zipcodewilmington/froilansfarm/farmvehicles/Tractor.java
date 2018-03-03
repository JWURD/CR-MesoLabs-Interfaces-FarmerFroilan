package com.zipcodewilmington.froilansfarm.farmvehicles;

public class Tractor extends Vehicle implements FarmVehicle {


    public Tractor(String vehicleType) {
        super(vehicleType);
    }

    public boolean isCurrentlyOperating(Vehicle farmMachine) {
        return false;
    }

    public void opperate() {

    }

    public String makeNoise() {
        return null;
    }
}
