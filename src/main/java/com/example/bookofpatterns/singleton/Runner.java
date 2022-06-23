package com.example.bookofpatterns.singleton;

public class Runner {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("MESSAGE1");

        Singleton singleton2 = Singleton.getInstance("MESSAGE2");
        Singleton singleton3 = Singleton.getInstance("Message saduiahiudhasiudha");

        System.out.println(singleton1.message);
        System.out.println(singleton2.message);
        System.out.println(singleton3.message);

    }
}
