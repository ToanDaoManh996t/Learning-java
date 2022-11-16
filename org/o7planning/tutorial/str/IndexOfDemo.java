package org.o7planning.tutorial.str;

public class IndexOfDemo {
    public static void main(String[] args) {
        String str = "This is a text";
        int index = str.indexOf("i");
        System.out.println(index);

        index = str.indexOf("i",4);
        System.out.println(index);

        index = str.indexOf("te");
        System.out.println(index);
    }
}
