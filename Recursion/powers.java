package Recursion;

public class powers {

    static int power(int a, int b) {
        if (b == 0)
            return 1;

        return a * power(a, b - 1);
    }

    static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        power(a, b);
        fib(b);
    }
}