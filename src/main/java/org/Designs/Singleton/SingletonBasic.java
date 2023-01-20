package org.Designs.Singleton;

public class SingletonBasic {

    private static SingletonBasic instance = null;
    private String message;

    private SingletonBasic(String message) {
        this.message = message;
    }

    public static SingletonBasic getInstance(String message) {
        if (instance == null) {
            instance = new SingletonBasic(message);
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }



}
