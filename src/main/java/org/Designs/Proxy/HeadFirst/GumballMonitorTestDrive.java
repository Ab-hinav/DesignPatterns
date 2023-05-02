package org.Designs.Proxy.HeadFirst;

import java.rmi.Naming;

public class GumballMonitorTestDrive {

    public static void main(String args[]){
        String[] location= {
                "rmi ://abc.might.com/gumballmachine",
                "rmi ://qwe.might.com/gumballmachine",
                "rmi ://ert.might.com/gumballmachine"
        };

        GumballMonitor []monitors = new GumballMonitor[location.length];

        for (int i=0;i<location.length;i++) {
            try{
                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machineRemote);
                System.out.println(monitors[i]);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        for (int i=0;i< monitors.length;i++){
            monitors[i].report();
        }

    }

}
