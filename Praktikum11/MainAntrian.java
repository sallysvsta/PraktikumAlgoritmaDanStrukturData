package Praktikum11;

import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan();
        int pilihan;

        do {
            System.out.println("\n--- MENU ANTRIAN LAYANAN UNIT KEMAHASISWAAN ---");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Tampilkan Antrian");
            System.out.println("6. Tampilkan Antrian Terdepan");
            System.out.println("7. Tampilkan Antrian Paling Akhir");
            System.out.println("8. Tampilkan Jumlah Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = scanner.nextLine();
                    antrian.enqueue(nama, nim);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian tidak penuh.");
                    break;
                case 5:
                    antrian.tampilkanAntrian();
                    break;
                case 6:
                    antrian.tampilkanDepan();
                    break;
                case 7:
                    antrian.tampilkanBelakang();
                    break;
                case 8:
                    antrian.jumlahAntrian();
                    break;
                case 9:
                    antrian.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
