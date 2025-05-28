package Jobsheet2Object;
import java.util.Scanner;
public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 mk1 = new MataKuliah21();
        System.out.println("MATA KULIAH KELAS SIB 1D");
        System.out.println("=================================");
        mk1.kodeMK = "MKALSD01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 12;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(4);
        System.out.println("\nSetelah Perubahan:");
        mk1.tampilInformasi();

        System.out.println("=================================");
        MataKuliah21 mk2 = new MataKuliah21("MKMTL02", "Matematika Lanjut", 4, 2);
        mk2.tampilInformasi();
    }
}