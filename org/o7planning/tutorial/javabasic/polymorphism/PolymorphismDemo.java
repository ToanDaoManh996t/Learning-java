package org.o7planning.tutorial.javabasic.polymorphism;

import org.o7planning.tutorial.javabasic.inheritance.animal.AsianCat;
import org.o7planning.tutorial.javabasic.inheritance.animal.Cat;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 3, 20);
        Cat cat2 = new AsianCat("ATom", 2, 19);
        System.out.println("Animal name of cat1: " + cat1.getAnimalName());
        System.out.println("Animal name of cat1: " + cat2.getAnimalName());
    }
}
