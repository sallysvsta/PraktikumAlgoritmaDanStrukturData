package ReviewDaspro;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();

        String[] namaMataKuliah = new String[jumlahMatkul];
        double[] nilaiAngka = new double[jumlahMatkul];
        String[] nilaiHuruf = new String[jumlahMatkul];
        double[] bobotNilai = new double[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];

        double totalBobotXSKS = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMataKuliah[i] = sc.nextLine();

            System.out.print("Masukkan jumlah SKS untuk MK " + namaMataKuliah[i] + ": ");
            sks[i] = sc.nextInt();
            
            System.out.print("Masukkan nilai Angka untuk MK " + namaMataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            bobotNilai[i] = nilaiMutuSetara(nilaiHuruf[i]);

            totalBobotXSKS += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("\n================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================================");
        System.out.printf("%-35s %-10s %-12s %-12s %-8s\n", "MK", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-35s %-10d %-12.2f %-12s %-8.2f\n", namaMataKuliah[i], sks[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        double ipSemester = totalBobotXSKS / totalSKS;
        System.out.println("================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);

        sc.close();
    }

    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 73) {
            return "B+";
        } else if (nilaiAngka >= 65) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else if (nilaiAngka >= 39) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double nilaiMutuSetara(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0;
        }
    }
}

