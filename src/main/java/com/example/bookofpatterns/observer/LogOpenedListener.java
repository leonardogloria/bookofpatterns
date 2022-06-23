package com.example.bookofpatterns.observer;

public class LogOpenedListener implements EventListener {

    @Override
    public void update(String eventType) {
        System.out.println("Saved to Log  " + eventType);
    }
}
