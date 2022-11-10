package org.o7planning.tutorial.cls;

import org.o7planning.tutorial.itf.CanDrink;
import org.o7planning.tutorial.itf.CanEat;

public class Mouse extends Animal implements CanEat, CanDrink {
    @Override
    public void back() {
        System.out.println("Mouse back ....");
    }

    @Override
    public int getVelocity() {
        return 85;
    }

    @Override
    public void eat() {
        System.out.println("Mouse eat....");
    }

    @Override
    public void drink() {
        System.out.println("Mouse drink...");
    }
}
