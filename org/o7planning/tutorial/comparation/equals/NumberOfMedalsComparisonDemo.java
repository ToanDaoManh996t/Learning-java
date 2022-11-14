package org.o7planning.tutorial.comparation.equals;

public class NumberOfMedalsComparisonDemo {
    public static void main(String[] args) {
        NumberOfMedals american = new NumberOfMedals(40, 15,15);
        NumberOfMedals japan = new NumberOfMedals(10 , 5,20);
        NumberOfMedals korea = new NumberOfMedals(10, 5, 20);

        System.out.println(american.equals(japan));
        System.out.println(korea.equals(japan));
    }
}
