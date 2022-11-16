package org.o7planning.tutorial.str;

public class ReplaceDemo {
    public static void main(String[] args) {
        String str = "This is a text";
        String s2 = str.replace("i", "x");
        System.out.println(s2);
        String s3 = str.replaceAll("is", "abc");
        System.out.println(s3);
        String s4 = str.replaceFirst("is", "abc");
        System.out.println(s4);
        String s5 = str.replaceAll("is|te", "+");
        System.out.println(s5);

        System.out.println(str);
    }
}
