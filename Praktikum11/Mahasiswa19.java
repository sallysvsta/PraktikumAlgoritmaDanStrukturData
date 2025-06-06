package Praktikum11;
public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa19(){
    }

     public Mahasiswa19(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-5s %.2f\n", nama, nim, kelas, ipk);
    }
}

