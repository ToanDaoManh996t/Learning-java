package org.o7planning.tutorial.javabasic.controlflow;

public class SwitchExample1 {
    public static void main(String[] args) {
        int age = 19;
        switch (age) {
            case 18:
                System.out.println("You are 18 years old");
                break;
            case 20:
                System.out.println("You are 20 years old");
                break;
            default:
                System.out.println("You are not 18 or 20 years old");
        }
    }
}
