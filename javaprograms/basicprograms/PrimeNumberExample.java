package javaprograms.basicprograms;

public class PrimeNumberExample {
    public static void main(String[] args) {
        int i;
        int m = 0;
        int flag = 0;
        int n = 19;
        m = n/2;
        if (n == 0 || n ==1) {
            System.out.println(n + " is not a prime number");
        } else {
            for(i = 2; i <= m; i++) {
                if(n%i== 0) {
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }
    }
}
