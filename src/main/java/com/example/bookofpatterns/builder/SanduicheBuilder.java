package com.example.bookofpatterns.builder;

public class SanduicheBuilder {
    private int tamanho;
    private QUEIJO queijo;
    private boolean tomate;
    private boolean ketchup;
    private boolean mostarda;
    private boolean azeitonas;
    private boolean alface;

    public SanduicheBuilder(int tamanho){
        this.tamanho = tamanho;
    }

    public SanduicheBuilder comQueijo(QUEIJO queijo){
        this.queijo = queijo;
        return this;
    }
    public SanduicheBuilder comTomate() {
        this.tomate = true;
        return this;
    }
    public SanduicheBuilder comKetchup(){
        this.ketchup = true;
        return this;
    }
    public SanduicheBuilder comMostarda(){
        this.mostarda = true;
        return this;
    }
    public SanduicheBuilder comAzeitonas(){
        this.azeitonas = true;
        return this;
    }
    public SanduicheBuilder comAlface(){
        this.alface = true;
        return this;
    }
    public Sanduiche build() {
        return new Sanduiche(this);
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public QUEIJO getQueijo() {
        return queijo;
    }

    public void setQueijo(QUEIJO queijo) {
        this.queijo = queijo;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }

    public boolean isMostarda() {
        return mostarda;
    }

    public void setMostarda(boolean mostarda) {
        this.mostarda = mostarda;
    }

    public boolean isAzeitonas() {
        return azeitonas;
    }

    public void setAzeitonas(boolean azeitonas) {
        this.azeitonas = azeitonas;
    }

    public boolean isAlface() {
        return alface;
    }

    public void setAlface(boolean alface) {
        this.alface = alface;
    }
}
