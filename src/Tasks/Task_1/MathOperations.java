package Tasks.Task_1;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double fNumb = in.nextDouble();
        System.out.print("Input second number: ");
        double sNumb = in.nextDouble();

        double sum, sub, mult, div;

        sum = fNumb + sNumb;
        sub = fNumb - sNumb;
        mult = fNumb * sNumb;
        div = fNumb / sNumb;

        System.out.println(fNumb + " + " + sNumb + " = " + sum);
        System.out.println(fNumb + " - " + sNumb + " = " + sub);
        System.out.println(fNumb + " * " + sNumb + " = " + mult);
        System.out.println(fNumb + " / " + sNumb + " = " + div);
    }
}
