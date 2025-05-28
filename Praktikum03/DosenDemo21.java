package Praktikum03;

import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Dosen : ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();
        Dosen21[] dosenArray = new Dosen21[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode              : ");
            String kode = sc.nextLine();
            System.out.print("Nama              : ");
            String nm = sc.nextLine();
            System.out.print("Jenis Kelamin     : ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia              : ");
            int usia = sc.nextInt();
            sc.nextLine();

            dosenArray[i] = new Dosen21(kode, nm, jenisKelamin, usia);
        }

        int index = 1;
        for (Dosen21 dosen : dosenArray) {
            System.out.println("Data Dosen ke- " + index++);
            System.out.println("\nKode                : " + dosen.kode);
            System.out.println("Nama                : " + dosen.nama);
            System.out.println("Jenis Kelamin       : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia                : " + dosen.usia);
            System.out.println("-----------------------------");
        }
        Dosen21.dataSemuaDosen(dosenArray);
        Dosen21.jumlahDosenPerJenisKelamin(dosenArray);
        Dosen21.rataUsia(dosenArray);
        Dosen21.infoDosenPalingTua(dosenArray);
        Dosen21.infoDosenPalingMuda(dosenArray);
    }
}
