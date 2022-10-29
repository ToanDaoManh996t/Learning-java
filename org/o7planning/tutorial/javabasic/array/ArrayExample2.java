package org.o7planning.tutorial.javabasic.array;

public class ArrayExample2 {
    public static void main(String[] args) {

        int[] myArray = new int[5];
        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = 100 * index * index + 3;
        }
        System.out.println("myArray[3] = " + myArray[3]);
    }
}
