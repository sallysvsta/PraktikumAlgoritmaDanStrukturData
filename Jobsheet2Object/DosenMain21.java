package Jobsheet2Object;

public class DosenMain21 {
    public static void main(String[] args) {
        Dosen21 dosen1 = new Dosen21();
        System.out.println("DATA DOSEN");
        System.out.println("=======================================");

        dosen1.idDosen = "TI1";
        dosen1.nama = "Vivin Ayu Lestari, S.Pd., M.Kom";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2019;
        dosen1.bidangKeahlian = "Teknik Informatika";
        dosen1.tampilInformasi();

        System.out.println("=======================================");
        Dosen21 dosen2 = new Dosen21("MTL2", "Adevian Fairuz Pratama, S.ST, M.Eng", true, 2020, "Matematika Lanjut");
        dosen2.tampilInformasi();

        System.out.println("=======================================");
        Dosen21 dosen3 = new Dosen21("BD3", "Farid Angga Pribadi, S.Kom.,M.Kom", true, 2019,"Basis Data");
        dosen3.ubahKeahlian("Informatika");
        dosen3.tampilInformasi();
    }
}
