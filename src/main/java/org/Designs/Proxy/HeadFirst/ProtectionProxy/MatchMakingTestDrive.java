package org.Designs.Proxy.HeadFirst.ProtectionProxy;

public class MatchMakingTestDrive {

    PersonBean personBean;
    public MatchMakingTestDrive(PersonBean personBean){
        this.personBean = personBean;
    }

    public static void main(String[] args) {
        MatchMakingTestDrive testDrive = new MatchMakingTestDrive(new PersonBeanImpl());
        testDrive.drive();
    }

    public void drive(){

        PersonBean ownerProxy = personBean.getOwnerProxy(personBean);


    }



}
