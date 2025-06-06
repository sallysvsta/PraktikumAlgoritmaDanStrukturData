package Praktikum01;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mataKuliah = {"Pancasila","KTI","CTPS","Matdas","BING","Daspro","Praktikum Daspro","K3"};

        int jmlMK = mataKuliah.length;
        double[] nilaiAngka = new double[jmlMK];
        String[] nilaiHuruf = new String[jmlMK];
        double[] bobotNilai = new double[jmlMK];
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < jmlMK; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            bobotNilai[i] = hitungBobotNilai(nilaiHuruf[i]);
        }

        System.out.println("\nHasil Konversi Nilai");
        System.out.printf("%-40s %-15s %-10s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        for (int i = 0; i < jmlMK; i++) {
            System.out.printf("%-40s %-15.2f %-10s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += bobotNilai[i];
        }

        double ipk = totalBobot / jmlMK;
        System.out.printf("\nIP: %.2f\n", ipk);
    }

    private static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 73) {
            return "B+";
        } else if (nilai >= 65) {
            return "B";
        } else if (nilai >= 60) {
            return "C+";
        } else if (nilai >= 50) {
            return "C";
        } else if (nilai >= 39) {
            return "D";
        } else {
            return "E";
        }
    }

    private static double hitungBobotNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default: // "E"
                return 0.0;
        }
    }
}