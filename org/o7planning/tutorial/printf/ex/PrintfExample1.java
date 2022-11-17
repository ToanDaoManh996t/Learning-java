package org.o7planning.tutorial.printf.ex;

public class PrintfExample1 {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Smith";
        int age = 20;
        System.out.printf("My name is %s %s, I'm %d years old%n", firstName, lastName,age);
        System.out.printf("One%nTwo%nThree%n");
        System.out.printf("My name is %s %s","James", "Smith");
        System.out.println("age = " + age);
    }
}
