package javaprograms.basicprograms;

public class FibonacciExample1 {
    public static void main(String[] args) {
        int number0 = 0;
        int number1 = 1;
        int number2;
        int i;
        int count = 15;

        System.out.println(number0 + " " + number1);
        for(i = 2; i < count; i++) {
            number2 = number0 + number1;
            System.out.println(number2);
            number0 = number1;
            number1 = number2;
        }
    }
}
