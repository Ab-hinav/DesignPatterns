package org.Designs.NullObject;

public class VehicleFactory {

   public static Vehicle getVehicle(String vehicleName) {
        if(vehicleName == null) {
            return new NullVehicle();
        }
        if(vehicleName.equalsIgnoreCase("car")) {
            return new Car();
        }
        return new NullVehicle();
    }


}
