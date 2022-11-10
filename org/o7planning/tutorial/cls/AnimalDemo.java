package org.o7planning.tutorial.cls;

import org.o7planning.tutorial.itf.CanEat;

public class AnimalDemo {
    public static void main(String[] args) {
        System.out.println("Drink " + Cat.SEVENUP);

        CanEat canEat1 = new Cat("Tom");
        CanEat canEat2 = new Mouse();

        canEat1.eat();
        canEat2.eat();

        boolean isCat = canEat1 instanceof Cat;
        System.out.println("canEat1 is Cat? " + isCat);

        if(canEat2 instanceof Mouse) {
            Mouse mouse = (Mouse) canEat2;
            mouse.drink();
        }
    }
}
