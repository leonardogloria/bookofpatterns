package com.example.bookofpatterns.prototype;

import java.util.Objects;

public class Circulo extends Shape{
    int raio;

    public Circulo() {
    }
    public Circulo(Circulo target){
        super(target);
        if(target != null){
            this.raio = target.raio;
        }
    }

    @Override
    public Shape clone() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circulo circulo = (Circulo) o;
        return raio == circulo.raio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), raio);
    }
}
