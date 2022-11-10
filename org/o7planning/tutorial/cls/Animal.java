package org.o7planning.tutorial.cls;

import org.o7planning.tutorial.itf.CanMove;

public abstract class Animal implements CanMove {
    @Override
    public void run() {
        System.out.println("Animal run.....");
    }
}
