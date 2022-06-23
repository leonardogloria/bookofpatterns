package com.example.bookofpatterns.builder;

public class Runner {
    public static void main(String[] args) {

        Sanduiche sanduiche = new SanduicheBuilder(15)
                .comQueijo(QUEIJO.CHEDAR)
                .comAlface()
                .comKetchup()
                .comAzeitonas()
                .build();

    }
}
