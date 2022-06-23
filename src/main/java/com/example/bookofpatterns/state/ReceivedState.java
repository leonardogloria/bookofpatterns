package com.example.bookofpatterns.state;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("Esse eh o ultimo Status");
    }

    @Override
    public void prev(Package pkg) {
        //Notifica o setor de logistica que foi entrega
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println( "O pacote foi recebido");
    }
}
