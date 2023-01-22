package org.Designs.Command.headFirst;

public class GarageDoor {

    private String name=null;

    public GarageDoor(String name) {
        this.name = name;
    }

    public GarageDoor() {
    }

    public void up() {
        if (name != null) {
            System.out.println(name + " garage door is open");
        } else {
            System.out.println("Garage door is open");
        }
    }

    public void down() {
        if (name != null) {
            System.out.println(name + " garage door is closed");
        } else {
            System.out.println("Garage door is closed");
        }
    }

    public void stop() {
        if (name != null) {
            System.out.println(name + " garage door is stopped");
        } else {
            System.out.println("Garage door is stopped");
        }
    }

    public void lightOn() {
        if (name != null) {
            System.out.println(name + " garage door light is on");
        } else {
            System.out.println("Garage door light is on");
        }
    }

    public void lightOff() {
        if (name != null) {
            System.out.println(name + " garage door light is off");
        } else {
            System.out.println("Garage door light is off");
        }
    }


}
