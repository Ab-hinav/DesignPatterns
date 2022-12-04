package org.Designs.Strategy.QuackBehaviours;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }

}
