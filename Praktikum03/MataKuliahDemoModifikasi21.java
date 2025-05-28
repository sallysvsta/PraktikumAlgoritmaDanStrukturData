package Praktikum03;

import java.util.Scanner;

public class MataKuliahDemoModifikasi21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah yang ingin di-Input: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah21[] arrayOfMatakuliah = new MataKuliah21[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode              : ");
            kode = sc.nextLine();
            System.out.print("Nama              : ");
            nama = sc.nextLine();
            System.out.print("Sks               : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam        : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayOfMatakuliah[i] = new MataKuliah21("", "", 0, jumlahJam);
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
