package org.Designs.Proxy.HeadFirst.RemoteProxy;

public class GumballMonitor {

    GumballMachineRemote machine ;

    public GumballMonitor(GumballMachineRemote machine){
        this.machine = machine;
    }

    public void report(){
        try {
            System.out.println("Gumball machine "+machine.getLocation());
            System.out.println("Gumball machine "+machine.getCount());
            System.out.println("Gumball machine "+machine.getState());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
