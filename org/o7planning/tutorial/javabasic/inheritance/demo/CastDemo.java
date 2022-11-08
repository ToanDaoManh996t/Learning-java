package org.o7planning.tutorial.javabasic.inheritance.demo;

import org.o7planning.tutorial.javabasic.inheritance.animal.Animal;
import org.o7planning.tutorial.javabasic.inheritance.animal.Cat;
import org.o7planning.tutorial.javabasic.inheritance.animal.Mouse;

import java.util.Random;

public class CastDemo {
    public static Animal getRandomAnimal() {
        int random = new Random().nextInt(2);
        Animal animal = null;
        if(random == 0) {
            animal = new Cat("Tom",3, 20);
        } else {
            animal = new Mouse("Jerry", 5);
        }
        return animal;
    }

    public static void main(String[] args) {
        Animal animal = getRandomAnimal();
        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Cat height: " + cat.getHeight());
        } else if (animal instanceof Mouse) {
            Mouse mouse = (Mouse) animal;
            System.out.println("Mouse weight: " + mouse.getWeight());
        }
    }
}
