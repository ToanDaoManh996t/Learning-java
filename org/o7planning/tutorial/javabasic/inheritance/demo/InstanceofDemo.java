package org.o7planning.tutorial.javabasic.inheritance.demo;

import org.o7planning.tutorial.javabasic.inheritance.animal.Animal;
import org.o7planning.tutorial.javabasic.inheritance.animal.Cat;
import org.o7planning.tutorial.javabasic.inheritance.animal.Mouse;

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal tom = new Cat("Tom", 3, 20);
        System.out.println("Name: " + tom.getName());
        System.out.println("animalName: " + tom.getAnimalName());

        boolean isMouse = tom instanceof Mouse;
        System.out.println(isMouse);

        boolean isCat = tom instanceof Cat;
        System.out.println(isCat);

        boolean isAnimal = tom instanceof Animal;
        System.out.println(isAnimal);
    }
}
