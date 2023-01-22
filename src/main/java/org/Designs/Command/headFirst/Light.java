package org.Designs.Command.headFirst;

public class Light {

    private String name=null;

    public Light(String name) {
        this.name = name;
    }

    public Light() {
    }

    public void on() {
        if (name != null) {
            System.out.println(name + " light is on");
        } else {
            System.out.println("Light is on");
        }
    }

    public void off() {
        if (name != null) {
            System.out.println(name + " light is off");
        } else {
            System.out.println("Light is off");
        }
    }


}
