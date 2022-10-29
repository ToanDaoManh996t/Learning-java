package org.o7planning.tutorial.javabasic.controlflow;

public class ElseIfExample2 {
    public static void main(String[] args) {
        int age = 20;
        if (age <= 17) {
            System.out.println("You are 17 or younger");
        } else if (age == 18) {
            System.out.println("You are 18 years old");
        } else if (age > 18 && age < 40) {
            System.out.println("You are between 19 and 39");
        } else {
            if (age != 50) {
                System.out.println("You are not 50 years old");
            }
            if (!(age == 50)) {
                System.out.println("You are not 50 years old");
            }
            if (age == 60 || age == 70) {
                System.out.println("You are 60 or 70 years old");
            }
        }
    }
}
