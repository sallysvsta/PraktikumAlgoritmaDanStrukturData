package CaseMethod2;
import java.util.LinkedList;
import java.util.Scanner;

public class MainKlinik {
    public static void main(String[] args) {
        LinkedListPasien antrianPasien = new LinkedListPasien();
        LinkedList <TransaksiLayanan> riwayatTransaksi = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("\nNama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("NIK: ");
                    String nik = input.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = input.nextLine();
                    Pasien pasienBaru = new Pasien(nama, nik, keluhan);
                    antrianPasien.tambahPasien(pasienBaru);
                    System.out.println(">> Pasien masuk ke dalam antrian.\n");
                    break;

                case 2:
                    System.out.println("\n-- Daftar Antrian Pasien --");
                    antrianPasien.tampilkanAntrian();
                    break;

                case 3:
                    if (antrianPasien.isEmpty()) {
                        System.out.println(">> Tidak ada pasien dalam antrian.\n");
                        break;
                    }
                    Pasien pasienDilayani = antrianPasien.layaniPasien();
                    System.out.println("\nPasien " + pasienDilayani.nama + " dipanggil");
                    System.out.print("Masukkan ID Dokter: ");
                    String idDokter = input.nextLine();
                    System.out.print("Masukkan Nama Dokter: ");
                    String namaDokter = input.nextLine();
                    System.out.print("Masukkan Durasi Layanan (jam): ");
                    int durasi = input.nextInt();
                    input.nextLine();
                    Dokter dokter = new Dokter(idDokter, namaDokter);
                    TransaksiLayanan transaksi = new TransaksiLayanan(pasienDilayani, dokter, durasi);
                    riwayatTransaksi.add(transaksi);
                    System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.\n");
                    break;

                case 4:
                    int sisa = antrianPasien.sisaAntrian();
                    System.out.println(">> Sisa pasien dalam antrian: " + sisa + "\n");
                    break;

                case 5:
                    System.out.println("\n-- Riwayat Transaksi --");
                    if (riwayatTransaksi.isEmpty()) {
                        System.out.println(">> Belum ada transaksi.\n");
                    } else {
                        for (TransaksiLayanan t : riwayatTransaksi) {
                            t.tampilkanTransaksi();
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println(">> Terima kasih telah menggunakan sistem.");
                    input.close();
                    return;

                default:
                    System.out.println(">> Menu tidak tersedia.\n");
            }
        }
    }
}