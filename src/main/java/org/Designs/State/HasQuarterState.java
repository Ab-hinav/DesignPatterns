package org.Designs.State;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    private static final long serialVersionUID = 4;
    transient GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if (winner==0 && gumballMachine.getCount()>1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
            return true;
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
            return true;
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
