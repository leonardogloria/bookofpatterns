package com.example.bookofpatterns.singleton;

public class Singleton {
    private static Singleton instance;
    public String message;

    private Singleton(String message){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.message = message;
    }
    public static Singleton getInstance(String message){
        if(instance == null){
            instance = new Singleton(message);
        }
        return instance;
    }
}
