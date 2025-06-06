package Praktikum02;
public class MataKuliahMain19 {
    public static void main(String[] args) {
    
        MataKuliah19 mk1 = new MataKuliah19();
        mk1.kodeMK = "PSI";
        mk1.nama = "Pengenalan Sistem Informasi";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        System.out.println();

        MataKuliah19 mk2 = new MataKuliah19("PRAKALSD", "Praktikum Algoritma dan Struktur Data", 2, 6);

        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.kurangiJam(5); 
        
        mk2.tambahJam(3);
    }
}