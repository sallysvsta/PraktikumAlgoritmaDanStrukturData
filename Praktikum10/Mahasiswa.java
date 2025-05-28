package Praktikum10;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    int semester;

    public Mahasiswa(String nama, String nim, String prodi, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.semester = semester;
    }

    public String toString() {
        return nama + " (" + nim + ") - " + prodi + ", Semester " + semester;
    }
}