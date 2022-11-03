package org.o7planning.tutorial.javabasic.controlflow;

public class IfExample {
    public static void main(String[] args) {
        int age = 10;
        System.out.println("Your age: " + age);

        if (age > 20) {
            System.out.println("You can pass");
            System.out.println("Age is greater than 20");
        }
        System.out.println("Done");
    }
}
