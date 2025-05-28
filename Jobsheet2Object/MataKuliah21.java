package Jobsheet2Object;
import java.util.Scanner;
public class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Unik Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Satuan Kredit Semester (SKS): " + sks);
        System.out.println("Jumlah total jam/minggu Mata Kuliah: " + jumlahJam);

    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam( int jam){
        if (this.jumlahJam - jam >= 0) {
            this.jumlahJam -= jam;
        } else {
            System.out.println("Jumlah jam awal lebih kecil dari jam pengurang!");
        }
    }

    public MataKuliah21() {
        
    }

    public MataKuliah21(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}

