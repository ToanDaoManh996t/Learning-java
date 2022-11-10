package org.o7planning.tutorial.cls;

import org.o7planning.tutorial.itf.CanDrink;
import org.o7planning.tutorial.itf.CanEat;

public class Cat extends Animal implements CanEat, CanDrink {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public void back() {
        System.out.println(name + "cat back...");
    }

    @Override
    public int getVelocity() {
        return 110;
    }

    @Override
    public void eat() {
        System.out.println(name + "cat eat...");
    }

    @Override
    public void drink() {
        System.out.println(name + "cat drink...");
    }
}
