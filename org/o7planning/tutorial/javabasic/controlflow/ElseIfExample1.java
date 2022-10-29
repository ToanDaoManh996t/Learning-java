package org.o7planning.tutorial.javabasic.controlflow;

public class ElseIfExample1 {
    public static void main(String[] args) {
        int score = 60;
        System.out.println("Your score = " + score);

        if (score < 50) {
            System.out.println("Not pass");
        } else if (score >= 50 && score < 80) {
            System.out.println("Pass");
        } else {
            System.out.println("Very good");
        }
    }
}
