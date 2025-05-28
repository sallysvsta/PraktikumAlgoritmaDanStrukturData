package Praktikum03;

public class Dosen21 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen21(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Umur            : " + usia);
        System.out.println("==========================");
    }
    public static void dataSemuaDosen(Dosen21[] arrayOfDosen) {
        System.out.println("=== Data Semua Dosen ===");
        for (Dosen21 d : arrayOfDosen) {
            d.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen21 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) { 
                jumlahPria++;
            } else { 
                jumlahWanita++;
            }
        }
        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        System.out.println("Pria   : " + jumlahPria);
        System.out.println("Wanita : " + jumlahWanita);
    }

    public static void rataUsia(Dosen21[] arrayOfDosen) {
        int totalUsiaPria = 0, jmlP = 0;
        int totalUsiaWanita = 0, jmlW = 0;
    
        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jmlP++;
            } else { 
                totalUsiaWanita += dosen.usia;
                jmlW++;
            }
        }
    
        System.out.println("=====================");
        System.out.println("Rata-rata Usia Dosen Pria   : " + (jmlP > 0 ? (totalUsiaPria / (double) jmlP) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (jmlW > 0 ? (totalUsiaWanita / (double) jmlW) : 0));
        System.out.println("=====================");
    }

    public static void infoDosenPalingTua(Dosen21[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }

        Dosen21 dosenTertua = arrayOfDosen[0];

        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\n======== DOSEN PALING TUA ========");
        dosenTertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen21[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen21 dosenTermuda = arrayOfDosen[0];

        for (Dosen21 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Muda ===");
        dosenTermuda.cetakInfo();
    }

}