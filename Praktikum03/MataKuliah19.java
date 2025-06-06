package Praktikum03;
public class MataKuliah19 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah19() {

    }
    public MataKuliah19(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void cetakInfo() {
        System.out.println("Kode Mata Kuliah: " + kode);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void tambahData() {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

}
}