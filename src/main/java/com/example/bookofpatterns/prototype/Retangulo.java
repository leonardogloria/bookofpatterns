package com.example.bookofpatterns.prototype;

import java.util.Objects;

public class Retangulo extends Shape {
    int width;
    int height;

    public Retangulo() {
    }

    public Retangulo(Retangulo target){
        super(target);
        if(target != null){
            this.height = target.height;
            this.width = target.width;
        }
    }

    @Override
    public Shape clone() {
        return new Retangulo(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Retangulo retangulo = (Retangulo) o;
        return width == retangulo.width && height == retangulo.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
