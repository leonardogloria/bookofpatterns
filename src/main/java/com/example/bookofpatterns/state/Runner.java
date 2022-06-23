package com.example.bookofpatterns.state;

public class Runner {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.getState().printStatus();
        pkg.nextState();
        pkg.getState().printStatus();
        pkg.previousState();
        pkg.getState().printStatus();
        pkg.nextState();
        pkg.nextState();
        pkg.getState().printStatus();
    }
}
