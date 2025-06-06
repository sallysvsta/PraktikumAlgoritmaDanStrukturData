package Praktikum01;
import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double sisi;

        do {
            // Menampilkan menu
            System.out.println("Menu:");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Input sisi kubus
                    System.out.print("Masukkan sisi kubus: ");
                    sisi = input.nextDouble();
                    // Menghitung dan menampilkan volume kubus
                    System.out.println("Volume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    // Input sisi kubus
                    System.out.print("Masukkan sisi kubus: ");
                    sisi = input.nextDouble();
                    // Menghitung dan menampilkan luas permukaan kubus
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    // Input sisi kubus
                    System.out.print("Masukkan sisi kubus: ");
                    sisi = input.nextDouble();
                    // Menghitung dan menampilkan keliling kubus
                    System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }

    // Fungsi untuk menghitung volume kubus
    static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

    // Fungsi untuk menghitung luas permukaan kubus
    static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    // Fungsi untuk menghitung keliling kubus
    static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}