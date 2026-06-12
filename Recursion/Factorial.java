package Recursion;

public class Factorial {
    public static int FactorialN(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * FactorialN(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int b = 11;
        int result = FactorialN(n);
        System.out.println(result);

    }

}
