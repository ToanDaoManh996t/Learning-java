package org.o7planning.tutorial.comparation;

public class ReferenceEeDemo {
    public static void main(String[] args) {
        String str1 = "String 1";
        String str2 = new String("String 1");

        String s1 = new String("This is text");
        String s2 = new String("This is text");

        boolean isEqualStr = str1.equals(str2);
        System.out.println(isEqualStr);

        boolean e1 = (s1 == s2);
        System.out.println(e1);

        Object obj = s1;
        boolean e2 = (obj == s1);
        System.out.println(e2);
    }
}
