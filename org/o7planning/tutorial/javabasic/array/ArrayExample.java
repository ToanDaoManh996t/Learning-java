package org.o7planning.tutorial.javabasic.array;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        int[] years = new int[] {2001, 1994, 1995, 2000, 2017};
        Arrays.sort(years);

        for (int year : years) {
            System.out.println("Year : " + year);
        }

        String yearString = Arrays.toString(years);
        System.out.println("Years: " + yearString);

        List<String> names = Arrays.asList("Tom","Jerry","Donald");

        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
