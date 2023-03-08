package org.Designs.NullObject;

public class Car implements Vehicle {

    @Override
    public String getVehicleName() {
        return "Car";
    }

    @Override
    public int getSeats() {
        return 4;
    }

}
