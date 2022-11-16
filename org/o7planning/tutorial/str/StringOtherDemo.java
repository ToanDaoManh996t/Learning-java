package org.o7planning.tutorial.str;

import java.util.Locale;

public class StringOtherDemo {
    public static void main(String[] args) {
        String str = "This is a text";
        System.out.println(str);

        String s2 = str.toLowerCase();
        System.out.println(s2);

        String s3 = str.toUpperCase();
        System.out.println(s3);

        boolean startWith = str.startsWith("This");
        System.out.println(startWith);

        str = "\t Java is cool! \t \n";
        System.out.println(str);

        String s4 = str.trim();
        System.out.println(s4);
    }
}
