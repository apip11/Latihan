package Nomer2;

import java.util.Scanner;

public class MenghitungJumlahKata {
    public static int jumlahKata(String str1) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = Character.toLowerCase(str1.charAt(i));
            if (ch == ' ') {
                count++;
            } else {

            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Kalimat: ");
        String str1 = sc.nextLine();

        System.out.println("Jumlah kata dari teks di atas : " + jumlahKata(str1));
    }
}
