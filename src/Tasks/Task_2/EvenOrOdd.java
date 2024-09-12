package Tasks.Task_2;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input integer number: ");
        int numb = in.nextInt();

        if (numb % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}