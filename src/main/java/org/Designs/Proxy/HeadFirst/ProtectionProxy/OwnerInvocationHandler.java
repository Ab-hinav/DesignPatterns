package org.Designs.Proxy.HeadFirst.ProtectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public OwnerInvocationHandler(PersonBean person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            }else if (method.getName().startsWith("set")) {
                return method.invoke(person,args);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;

    }
}
