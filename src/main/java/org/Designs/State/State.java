package org.Designs.State;

import java.io.Serializable;

public interface State extends Serializable {

    public void insertQuarter();
    public void ejectQuarter();
    public boolean turnCrank();
    public void dispense();


}
