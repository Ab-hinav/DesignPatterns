package org.Designs.Proxy.HeadFirst.ProtectionProxy;

import java.lang.reflect.Proxy;

public class PersonBeanImpl implements PersonBean{

    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0) return 0;
        rating = rating/ratingCount;
        return rating;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        ratingCount++;
        this.rating += rating;
    }

    PersonBean getOwnerProxy ( PersonBean personBean ) {
        return (PersonBean) Proxy.newProxyInstance( personBean.getClass().getClassLoader() ,
                personBean.getClass().getInterfaces(),new OwnerInvocationHandler(personBean));
    }

    PersonBean getNonOwnerProxy ( PersonBean personBean ) {
        return (PersonBean) Proxy.newProxyInstance( personBean.getClass().getClassLoader() ,
                personBean.getClass().getInterfaces() , new NonOwnerInvocationHandler(personBean));
    }


}
