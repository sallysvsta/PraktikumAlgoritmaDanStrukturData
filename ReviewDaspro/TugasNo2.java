package ReviewDaspro;
import java.util.Scanner;
public class TugasNo2 {

    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double sisi;

        do {
            System.out.println("\n=== KALKULATOR KUBUS ===");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = scanner.nextDouble();

                switch (pilihan) {
                    case 1:
                        System.out.println("Volume Kubus: " + hitungVolume(sisi));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                        break;
                    case 3:
                        System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                        break;
                }
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan program ini!");
            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
            }
        } while (pilihan != 4);
    }
}
