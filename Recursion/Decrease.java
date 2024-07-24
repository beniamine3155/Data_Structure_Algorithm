package Recursion;

public class Decrease {

    public static void printDecrease(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecrease(n - 1);
    }

    public static void main(String[] args) {
        printDecrease(10);
    }

}
