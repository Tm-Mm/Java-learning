package Tasks.Task_6;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input integer number: ");
        int n = in.nextInt();

        int[] a = new int[n];
        if (n >= 1)
            a[0] = 0;
        if (n >= 2)
            a[1] = 1;
        if (n >= 3) {
            for (int i = 2; i < n; i++) {
                a[i] = a[i - 2] + a[i - 1];
            }
        }

        System.out.print(n + " Fibonacci number: " + a[n - 1]);
    }
}
