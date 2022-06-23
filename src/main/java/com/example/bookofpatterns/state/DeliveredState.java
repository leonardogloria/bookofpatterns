package com.example.bookofpatterns.state;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        //Envia email para o cliente
        pkg.setState(new OrderedState());

    }

    @Override
    public void printStatus() {
        System.out.println("O pacote Saiu para entrega");
    }
}
