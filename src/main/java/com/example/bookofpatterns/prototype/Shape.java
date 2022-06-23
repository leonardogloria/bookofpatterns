package com.example.bookofpatterns.prototype;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String cor;

    public Shape() {
    }
    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.cor = target.cor;
        }
    }
    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && Objects.equals(cor, shape.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, cor);
    }
}
