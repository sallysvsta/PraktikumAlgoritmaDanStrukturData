package Praktikum01;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hari = new String[n];

        System.out.println("Masukkan data mata kuliah:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nama mata kuliah: ");
            namaMK[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine(); 
            System.out.print("Hari kuliah: ");
            hari[i] = input.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Jadwal Kuliah");
            System.out.println("2. Cari Mata Kuliah");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanJadwal(namaMK, sks, semester, hari);
                    break;
                case 2:
                    cariMatkul(namaMK, sks, semester, hari);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);

        input.close();
    }

    static void tampilkanJadwal(String[] namaMK, int[] sks, int[] semester, String[] hari) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nMenu Tampilkan Jadwal:");
        System.out.println("1. Seluruh Jadwal");
        System.out.println("2. Berdasarkan Hari");
        System.out.println("3. Berdasarkan Semester");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\nJadwal Kuliah:");
                for (int i = 0; i < namaMK.length; i++) {
                    System.out.println(namaMK[i] + " (" + sks[i] + " SKS) - Semester " + semester[i] + " - Hari " + hari[i]);
                }
                break;
            case 2:
                System.out.print("\nMasukkan hari: ");
                String hariCari = input.next();
                System.out.println("\nJadwal Kuliah Hari " + hariCari + ":");
                for (int i = 0; i < namaMK.length; i++) {
                    if (hari[i].equalsIgnoreCase(hariCari)) {
                        System.out.println(namaMK[i] + " (" + sks[i] + " SKS) - Semester " + semester[i]);
                    }
                }
                break;
            case 3:
                System.out.print("\nMasukkan semester: ");
                int semesterCari = input.nextInt();
                System.out.println("\nJadwal Kuliah Semester " + semesterCari + ":");
                for (int i = 0; i < namaMK.length; i++) {
                    if (semester[i] == semesterCari) {
                        System.out.println(namaMK[i] + " (" + sks[i] + " SKS) - Hari " + hari[i]);
                    }
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    static void cariMatkul(String[] namaMK, int[] sks, int[] semester, String[] hari) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String matkulCari = input.nextLine();

        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(matkulCari)) {
                System.out.println("\nData Mata Kuliah:");
                System.out.println("Nama: " + namaMK[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hari[i]);
                return; 
            }
        }

        System.out.println("Mata kuliah tidak ditemukan.");
    }
}