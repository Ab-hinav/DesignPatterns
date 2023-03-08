package org.Designs.NullObject;

public class NullVehicle implements Vehicle {

    @Override
    public String getVehicleName() {
        return "NullVehicle";
    }

    @Override
    public int getSeats() {
        return 0;
    }

}
