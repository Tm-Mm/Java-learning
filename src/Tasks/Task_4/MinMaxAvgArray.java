package Tasks.Task_4;

import java.util.Scanner;

public class MinMaxAvgArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input length array: ");
        int n = in.nextInt();
        System.out.println("Input number array elements: ");
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        double avg, min, max;
        avg = min = max = a[0];

        for (int i = 1; i < n; i++) {
            avg += a[i];
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }

        System.out.println("Max: " + max +
                           "\nMin: " + min +
                           "\nAvg: " + avg / n);
    }
}
