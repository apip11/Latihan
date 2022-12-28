package Nomer3;

import java.util.Scanner;

public class AtmSimulator {
    public static void main(String args[]) {

        int saldo = 1000000;
        int tarik;
        int setor;
        int transfer;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("ATM");
            System.out.println(" 1 = Tarik Tunai");
            System.out.println(" 2 = Setor Tunai");
            System.out.println(" 3 = Transfer");
            System.out.println(" 4 = History Transaksi");
            System.out.println(" 5 = EXIT");
            System.out.print("=========================");


            int choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("Nominal yang ingin anda Tarik:");

                    tarik = input.nextInt();

                    if (saldo >= tarik) {
                        saldo = saldo - tarik;
                        System.out.println("AMBIL UANG ANDA!!!");
                    } else {

                        System.out.println("Uang anda Kurang");
                    }
                    System.out.println("");
                    break;

                    case 2:
                    System.out.print("Nominal yang ingin anda Setor:");

                    setor = input.nextInt();

                    saldo = saldo + setor;
                    System.out.println("Uang anda berhasil di tambahkan");
                    System.out.println("");
                    break;

                    case 3:
                    System.out.print("Nominal yang ingin anda Transfer:");

                    transfer = input.nextInt();

                    if (saldo >= transfer) {
                        saldo = saldo - transfer;
                        System.out.println("Transfer anda berhasil");
                    } else {

                        System.out.println("Uang anda Kurang");
                    }
                    System.out.println("");
                    break;

                    case 4:
                    System.out.println("Jumlah uang anda : " + saldo);
                    System.out.println("");
                    break;

                    case 5:

                    System.exit(0);
            }
        }
    }
}
