package Praktikum02;
public class DosenMain19 {
    public static void main(String[] args) {
        
        Dosen19 dosen1 = new Dosen19();
        dosen1.idDosen = "D001";
        dosen1.nama = "Vivin Ayu Lestari, S.Pd., M.Kom";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Teknik Informatika";

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Sistem Informasi Bisnis");
        System.out.println();

        Dosen19 dosen2 = new Dosen19("D002", "Adevian Fairuz Pratama, S.ST, M.Eng", true, 2010, "Matematika");

        System.out.println("Informasi Dosen 2:");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.ubahKeahlian("Teknik Elektro");
    }
}
