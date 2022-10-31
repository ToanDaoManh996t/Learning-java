package org.o7planning.tutorial.javabasic.javastructure;

public class MethodSample {
    private String text = "Some text";
    public MethodSample() {

    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static int sum(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }
}
