package Nomer2;

import java.util.Scanner;

public class ReverseString {
    public int stringReverse() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Data : ");
        String n = input.nextLine();
        input.close();

        String kal[] = n.split("\\s");
        String reverse = "";

        for (int i = 0; i < kal.length; i++) {
            String kata = kal[i];
            String reverseKata = "";
            for (int j = kata.length() - 1; j >= 0; j--) {
                reverseKata = reverseKata + kata.charAt(j);
            }
            reverse = reverse + reverseKata + " ";
        }

        System.out.print("Output data : " + reverse);
        return 0;
    }

    public static void main(String[] args) {
        ReverseString main = new ReverseString();
        main.stringReverse();
    }
}  