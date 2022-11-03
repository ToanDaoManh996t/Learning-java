package org.o7planning.tutorial.javabasic.controlflow;

public class IfElseExample {
    public static void main(String[] args) {
        int age = 15;
        System.out.println("Your age: " + age);

        if (age >= 18) {
            System.out.println("You are accepted!");
        } else {
            System.out.println("Sorry!");
            System.out.println("Age is less than 18");
        }
        System.out.println("Done!");
    }
}
