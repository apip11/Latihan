package Nomer2;

import java.util.Scanner;

public class UpperLowerCase {
    public int konversiKar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Data : ");
        String n = input.nextLine();
        input.close();

        StringBuffer Str = new StringBuffer(n);

        for (int i = 0; i < n.length(); i++) {

            if (Character.isLowerCase(n.charAt(i))) {
                Str.setCharAt(i, Character.toUpperCase(n.charAt(i)));
            } else if (Character.isUpperCase(n.charAt(i))) {
                Str.setCharAt(i, Character.toLowerCase(n.charAt(i)));
            }
        }
        System.out.println("Output data :" + Str);

        return 0;
    }

    public static void main(String[] args) {
        UpperLowerCase main = new UpperLowerCase();
        main.konversiKar();
    }
}
