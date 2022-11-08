package org.o7planning.tutorial.javabasic.array;

public class TwoDimensionalExample1 {
    public static void main(String[] args) {
        int[][] myArray = new int[2][3];
        System.out.println("Length of myArray: " + myArray.length);
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("myArray[" + row + "," + col + "]=" + myArray[row][col]);
            }
        }
        System.out.println("---");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                myArray[row][col] = (row + 1)*(col + 1);
                System.out.println("myArray[" + row + "," + col + "]=" + myArray[row][col]);
            }
        }
    }
}
