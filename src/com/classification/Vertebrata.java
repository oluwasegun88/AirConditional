package com.classification;

public class Vertebrata {
    public static void main(String[] args) {
        Chordata chordata = new Chordata("Animal", "33", "1",2,1);
        Tilapia fish = new Tilapia("fish","20","4",2,1,"2",4,30);
        //fish.eat();
        //fish.swim();
        //Hen chicken = new Hen("Billy","23", "2",2,1,"2","1",40);
        //chicken.move();
        //chicken.fly();
        //chicken.eat();

        Goat ewure = new Goat("alake","32","3",2,1,"2",30,2);
        ewure.eat();
        ewure.bleat();
        ewure.move();


    }
}
