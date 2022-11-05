package org.o7planning.tutorial.javabasic.array;

public class ArrayForeachExample {
    public static void main(String[] args) {
        String[] fruits = new String[] {"Apple","Apricot","Banana"};
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}
