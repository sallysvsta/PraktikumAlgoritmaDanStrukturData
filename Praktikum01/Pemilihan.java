package Praktikum01;
import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = input.nextDouble();

        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
            return;
        }

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        char nilaiHuruf;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = 'A';
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = 'B';
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = 'B';
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = 'C';
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = 'C';
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = 'D';
        } else {
            nilaiHuruf = 'E';
        }

        String statusKelulusan = (nilaiHuruf == 'A' || nilaiHuruf == 'B' || nilaiHuruf == 'C') ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS";

        System.out.println("============================");
        System.out.println("nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("============================");
        System.out.println(statusKelulusan);
    }
}