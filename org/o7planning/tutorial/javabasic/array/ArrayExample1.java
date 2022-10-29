package org.o7planning.tutorial.javabasic.array;

public class ArrayExample1 {
    public static void main(String[] args) {
       int[] myArray = new int[5];
       myArray[0] = 10;
       myArray[1] = 14;
       myArray[2] = 36;
       myArray[3] = 27;
       myArray[4] = 18;
       System.out.println("Array length = " + myArray.length);
       System.out.println("myArray[3] = " + myArray[3]);
       for (int value = 0; value < myArray.length; value++) {
           System.out.println("Array item = " + myArray[value]);
       }
    }
}
