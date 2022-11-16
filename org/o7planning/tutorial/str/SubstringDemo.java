package org.o7planning.tutorial.str;

public class SubstringDemo {
    public static void main(String[] args) {
        String str = "This is a text";
        String substr = str.substring(3);
        System.out.println(substr);
        substr = str.substring(2,7);
        System.out.println(substr);
    }
}
