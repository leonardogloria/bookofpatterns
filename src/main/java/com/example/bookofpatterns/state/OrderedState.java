package com.example.bookofpatterns.state;

public class OrderedState implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());

    }

    @Override
    public void prev(Package pkg) {
        //Comeca processo de emitr nota
        System.out.println("Esse é o estado Raiz");

    }

    @Override
    public void printStatus() {
        System.out.println("Package Ordered");

    }
}
