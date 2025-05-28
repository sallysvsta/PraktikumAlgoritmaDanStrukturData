import java.util.Scanner;

public class percobaan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir, totlisalnilai;
        String nilaihuruf, keterangan;

        System.out.println("Program Menghitung Nlai Akhir");
        System.out.println("--------------------");
        System.out.print("Masukkan nilai tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis : ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = sc.nextDouble();
        System.out.println("--------------------");
        System.out.println("--------------------");
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai Tidak Valid");
        } else {
            nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.40 * uas);
            System.out.println("nilai akhir: " + nilaiAkhir);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("nilai Huruf = A");
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai Huruf = B+");
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai Huruf = B");
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai Huruf = C+");
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai Huruf = C");
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai Huruf = D");
            } else if (nilaiAkhir >= 39) {
                System.out.println("Nilai Huruf = E");
            }
        }

        System.out.println("--------------------");
        System.out.println("--------------------");
    }
}