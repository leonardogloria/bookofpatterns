package com.example.bookofpatterns.builder;

public class Sanduiche {
    private int tamanho;
    private QUEIJO queijo;
    private boolean tomate;
    private boolean ketchup;
    private boolean mostarda;
    private boolean azeitonas;
    private boolean alface;

    public Sanduiche(int tamanho, QUEIJO queijo, boolean tomate, boolean ketchup, boolean mostarda, boolean azeitonas, boolean alface) {
        this.tamanho = tamanho;
        this.queijo = queijo;
        this.tomate = tomate;
        this.ketchup = ketchup;
        this.mostarda = mostarda;
        this.azeitonas = azeitonas;
        this.alface = alface;
    }

    public Sanduiche(SanduicheBuilder builder) {
        this.tamanho = builder.getTamanho();
        this.queijo = builder.getQueijo();
        this.tomate = builder.isTomate();
        this.ketchup = builder.isKetchup();
        this.mostarda = builder.isMostarda();
        this.azeitonas = builder.isAzeitonas();
        this.alface = builder.isAlface();
    }
    public void esquentarSanduiche(){
        System.out.println("Esquentando!");
    }
}
enum QUEIJO {
    PRATO, CHEDAR, GORGONZOLA
}
