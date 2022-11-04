package org.o7planning.tutorial.javabasic.loop;

public class LabelledLoopBreakExample {
    public static void main(String[] args) {
        System.out.println("Labelled Loop Break example");
        int i = 0;

        label1:while (i < 5) {
            System.out.println("-----------\n");
            System.out.println("i = " + i);
            i++;

            label2:for (int j = 0; j < 3; j++) {
                System.out.println(" --> " + j);
                if (j > 0) {
                    break label1;
                }
            }
        }
        System.out.println("Done");
    }
}
