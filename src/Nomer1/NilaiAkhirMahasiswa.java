package Nomer1;

import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public int nilaiMahasiswa() {

        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa : ");
        int n = input.nextInt();
        input.nextLine();

        int[][] nil = new int[n][3];
        String[] nama, nim;
        nama = new String[n];
        nim = new String[n];
        double nilai;
        int totLulus = 0;
        String grade = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            System.out.println("");
            System.out.print("NIM = ");
            nim[i] = input.nextLine();
            System.out.print("Nama = ");
            nama[i] = input.nextLine();
            System.out.print("Kehadiran = ");
            nil[i][0] = input.nextInt();
            System.out.print("MidTest = ");
            nil[i][1] = input.nextInt();
            System.out.print("UAS = ");
            nil[i][2] = input.nextInt();
            input.nextLine();
        }

        System.out.println("=======================================================");
        System.out.println("No \t\t NIM \t\tNama \t Nilai Akhir \t  Grade");
        System.out.println("=======================================================");

        for (int i = 0; i < nama.length; i++) {
            System.out.print((i + 1) + "\t " + nim[i] + "\t" + "\t" + nama[i] + "\t");
            nilai = (0.2 * nil[i][0] + 0.4 * nil[i][1] + 0.4 * nil[i][2]);

            if (nilai >= 85 && nilai <= 100) {
                grade = "A";

            } else if (nilai >= 76 && nilai <= 84) {
                grade = "B";

            } else if (nilai >= 61 && nilai <= 75) {
                grade = "C";

            } else if (nilai >= 46 && nilai <= 60) {
                grade = "D";

            } else if (nilai >= 0 && nilai <= 45) {
                grade = "E";
            }

            if (nilai >= 61) {
                totLulus++;
            }

            System.out.println("\t" + nilai + "\t" + "\t" + "\t" + grade);
        }
        System.out.println("=======================================================");
        System.out.println("Jumlah Mahasiswa : " + n + " (berdasarkan hasil kalkulasi)");
        System.out.println("Jumlah Mahasiswa yg Lulus : " + totLulus + " (berdasarkan hasil kalkulasi)");
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + (n - totLulus) + " (berdasarkan hasil kalkulasi) ");

        return n;
    }

    public static void main(String[] args) {
        NilaiAkhirMahasiswa main = new NilaiAkhirMahasiswa();
        main.nilaiMahasiswa();
    }
}


