package org.o7planning.tutorial.javabasic.loop;

public class ForeachExample {
    public static void main(String[] args) {
        String[] fruits = new String[] {"Apple", "Apricot", "Banana"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}