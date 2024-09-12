package Tasks.Task_3;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = in.nextLine();

        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s += str.charAt(str.length() - i - 1);
        }

        System.out.println(s);
    }
}
