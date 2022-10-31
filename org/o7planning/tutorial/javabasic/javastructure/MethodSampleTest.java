package org.o7planning.tutorial.javabasic.javastructure;

public class MethodSampleTest {
    public static void main(String[] args) {
        MethodSample obj = new MethodSample();
        String text = obj.getText();
        System.out.println("Text = " + text);
        obj.setText("New text");
        System.out.println("Text = " + obj.getText());

        int sum = MethodSample.sum(10, 20, 30);
        System.out.println("Sum = " + sum);

        int sum2 = obj.sum(20, 30, 40);
        System.out.println("SUm = " + sum2);
    }
}
