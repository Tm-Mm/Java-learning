package Tasks.Task_5;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input integer number: ");
        int n = in.nextInt();
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println(n + "! = " + f);
    }
}
