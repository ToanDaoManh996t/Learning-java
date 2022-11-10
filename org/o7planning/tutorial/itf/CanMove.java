package org.o7planning.tutorial.itf;

public interface CanMove {
    public abstract void run();

    void back();

    public int getVelocity();
}
