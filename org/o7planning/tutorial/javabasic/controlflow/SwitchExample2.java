package org.o7planning.tutorial.javabasic.controlflow;

public class SwitchExample2 {
    public static void main(String[] args) {
        int age = 30;

        switch (age) {
            case 18:
                System.out.println("You are 18 years old");
                break;
            case 20:
            case 30:
            case 40:
                System.out.println("You are " + age);
                break;
            default:
                System.out.println("Other age");
        }
    }
}
