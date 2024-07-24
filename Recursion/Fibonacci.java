package Recursion;

public class Fibonacci {

    public static int nthFibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int fb = nthFibonacci(n - 1) + nthFibonacci(n - 2);
        return fb;
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(10));
    }

}
