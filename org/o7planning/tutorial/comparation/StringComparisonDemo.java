package org.o7planning.tutorial.comparation;

public class StringComparisonDemo {
    public static void main(String[] args) {
        String s1 = new String("This is a text");
        String s2 = new String("This is a text");

        boolean e1 = s1.equals(s2);
        System.out.println(e1);

        s2 = new String("New s2");
        boolean e2 = s1.equals(s2);
        System.out.println(e2);
    }
}
