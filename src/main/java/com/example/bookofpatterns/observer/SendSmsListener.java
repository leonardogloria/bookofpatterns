package com.example.bookofpatterns.observer;

public class SendSmsListener implements EventListener{

    @Override
    public void update(String eventType) {
        System.out.println("Enviandi SMS " + eventType);
    }
}
