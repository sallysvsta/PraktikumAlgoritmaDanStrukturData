package TugasJobsheet11;
public class Mahasiswa {
    String nama;
    String nim;
    String keperluan;

    Mahasiswa(String nama, String nim, String keperluan) {
        this.nama = nama;
        this.nim = nim;
        this.keperluan = keperluan;
    }
    public String toString() {
        return nama + " - " + nim + " - " + keperluan;
    }
}
