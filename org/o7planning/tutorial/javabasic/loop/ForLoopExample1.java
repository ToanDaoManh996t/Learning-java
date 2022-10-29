package org.o7planning.tutorial.javabasic.loop;

public class ForLoopExample1 {
    public static void main(String[] args) {
        int step = 1;
        for (int value = 0; value < 10; value = value + 3) {
            System.out.println("Step =" + step + "  value = " + value);
            step = step + 1;
        }
    }
}
