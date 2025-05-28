package Praktikum03;

import java.util.Scanner;

public class DataDosen21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();

        Dosen21[] arrayOfDosen21 = new Dosen21[jmlDosen];

        for (int i = 0; i < jmlDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode: ");
            String kode = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            boolean jenisKelamin = false;
            while (true) {
                System.out.print("Jenis Kelamin (P/W): ");
                char jk = sc.nextLine().trim().toUpperCase().charAt(0);
                if (jk == 'P') {
                    jenisKelamin = true;
                    break;
                } else if (jk == 'W') {
                    jenisKelamin = false;
                    break;
                } else {
                    System.out.println("Input salah! Masukkan 'P' untuk Pria atau 'W' untuk Wanita.");
                }
            }

            System.out.print("Umur: ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen21[i] = new Dosen21(kode, nama, jenisKelamin, usia);
        }

        System.out.println("-----------------------------");
        System.out.println("======== Data Dosen =========");
        System.out.println("-----------------------------");
        for (Dosen21 dsn : arrayOfDosen21) {
            dsn.cetakInfo();
        }

    }
}