package org.o7planning.tutorial.javabasic.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        boolean isAnimal = cat instanceof Animal;
        System.out.println(isAnimal);
        cat.say();

        Animal cat2 = new Cat();
        cat2.say();

        Animal ant = new Ant();
        ant.say();
    }
}
