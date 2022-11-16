package org.o7planning.tutorial.stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);

        sb.append("Hello...");
        System.out.println(sb);

        char c = '!';
        sb.append(c);
        System.out.println(sb);

        sb.insert(8, "Java");
        System.out.println(sb);

        sb.delete(5,8);
        System.out.println(sb);

        String substr = sb.substring(3,7);
        System.out.println(substr);
        System.out.println(sb);
    }
}
