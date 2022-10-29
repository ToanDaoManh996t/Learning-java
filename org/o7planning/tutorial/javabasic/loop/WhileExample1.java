package org.o7planning.tutorial.javabasic.loop;

public class WhileExample1 {
    public static void main(String[] args) {
        int value = 3;
        while(value <10) {
            System.out.println("Value = " + value);
            value = value + 2;
        }
    }
}
