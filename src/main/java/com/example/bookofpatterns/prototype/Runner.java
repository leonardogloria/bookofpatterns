package com.example.bookofpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Shape> shapesCopy = new ArrayList<>();
        Circulo circulo = new Circulo();
        circulo.x = 10;
        circulo.y = 20;
        circulo.raio = 15;
        circulo.cor = "Red";



        Circulo clone = (Circulo) circulo.clone();

        Retangulo retangulo = new Retangulo();
        retangulo.width = 60;
        retangulo.height =  80;
        retangulo.cor = "Blue";

        shapes.add(circulo);
        shapes.add(clone);
        shapes.add(retangulo);
        cloneAndCompare(shapes,shapesCopy);



    }
    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy){
        for(Shape shape: shapes){
            shapesCopy.add(shape.clone());
        }
        for(int i=0 ; i < shapes.size(); i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + ": Shapes possui objetos diferentes =)");
                if(shapes.get(i).equals(shapes.get(i))){
                    System.out.println(i + " Eles são identicos =)");
                }else{
                    System.out.println(i + " Eles não são identicos =/" );
                }
            }else {
                System.out.println(i + " Sahpes possui objetos iguais =/ ");
            }
        }
    }
}
