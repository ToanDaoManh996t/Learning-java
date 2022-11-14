package org.o7planning.tutorial.sorting;

import java.util.Arrays;

public class StringArraySortingDemo {
    public static void main(String[] args) {
        String[] fruits = new String[] {"Pineaple", "Apple", "Orange", "Banana"};
        Arrays.sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits " + i + ":" + fruits[i]);
        }
    }
}
