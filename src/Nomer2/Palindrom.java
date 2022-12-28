package Nomer2;

import java.util.Scanner;

public class Palindrom {
    public int palindromCek() {
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Input : ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Input " + n + " Kata :");

        String[] kata = new String[n];

        for (int i = 0; i < n; i++) {
            kata[i] = new String(input.nextLine()).toString();
            String rev = "";

            for (int k = kata[i].length() - 1; k >= 0; k--) {
                rev += kata[i].charAt(k);
            }
            if (kata[i].equals(rev)) {
                System.out.println(" merupakan palindrom");

            } else
                System.out.println(" bukan palindrom");
        }

        return n;
    }

    public static void main(String[] args) {
        Palindrom main = new Palindrom();
        main.palindromCek();
    }
}
