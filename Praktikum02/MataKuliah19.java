package Praktikum02;
public class MataKuliah19 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah19() {
    }

    public MataKuliah19(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + this.sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam telah ditambahkan menjadi: " + this.jumlahJam);
    }

    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi menjadi: " + this.jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam awal kurang dari jam yang akan dikurangi.");
        }
    }
}
