package Praktikum03;
import java.util.Scanner;
public class DataDosen19 {

    public static void dataSemuaDosen(Dosen19[] arrayOfDosen) {
        System.out.println("Data Semua Dosen");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].tampilkanData();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Berdasarkan Jenis Kelamin");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen19[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) { 
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        double rataPria = (countPria > 0) ? (double) totalUsiaPria / countPria : 0;
        double rataWanita = (countWanita > 0) ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("Rata-Rata Usia Dosen");
        System.out.println("Pria   : " + rataPria);
        System.out.println("Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen19[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen19 dosenTertua = arrayOfDosen[0];

        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua");
        dosenTertua.tampilkanData();
    }

    public static void infoDosenPalingMuda(Dosen19[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen19 dosenTermuda = arrayOfDosen[0];

        for (Dosen19 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda");
        dosenTermuda.tampilkanData();
    }

        void tampilkanData(Dosen19[] daftarDosen) {
        DataDosen19.dataSemuaDosen(daftarDosen);
        DataDosen19.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen19.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen19.infoDosenPalingTua(daftarDosen);
        DataDosen19.infoDosenPalingMuda(daftarDosen);
        
}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen19[] daftarDosen = new Dosen19[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine().toUpperCase();
            boolean jenisKelamin = jk.equals("L");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");

            daftarDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }

        DataDosen19 dataDosen = new DataDosen19();
        dataDosen.tampilkanData(daftarDosen);
    
    }
}
