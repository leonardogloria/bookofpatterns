package com.example.bookofpatterns.decorator;

public class Runner {
    public static void main(String[] args) {
        Beverage expresso = new Expresso();
        System.out.println(expresso.getDescription() + " $ " + expresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription() + " $ " + houseBlend.cost());


        Beverage houseBlend2 = new HouseBlend();
        houseBlend2 = new Milk(houseBlend2);
        houseBlend2 = new Milk(houseBlend2);
        houseBlend2 = new Mocha(houseBlend2);
        houseBlend2 = new Soy(houseBlend2);
        System.out.println(houseBlend2.getDescription() + " $ " + houseBlend2.cost());



    }
}
