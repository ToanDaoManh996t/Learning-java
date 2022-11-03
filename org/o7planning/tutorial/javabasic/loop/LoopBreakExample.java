package org.o7planning.tutorial.javabasic.loop;

public class LoopBreakExample {
    public static void main(String[] args) {
        System.out.println("Break example");

        int x = 2;
        while (x < 15) {
            System.out.println("-------------\n");
            System.out.println("x = " + x);

            if (x == 5) {
                break;
            }
            x++;
            System.out.println("x after ++ = " + x);
        }
        System.out.println("Done!");
    }
}
