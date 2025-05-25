package TugasJobsheet11;
public class Mahasiswa19 {
    String nama;
    String nim;
    String keperluan;

    Mahasiswa19(String nama, String nim, String keperluan) {
        this.nama = nama;
        this.nim = nim;
        this.keperluan = keperluan;
    }
    public void tampilkanData() {
        System.out.println(nama + " - " + nim + " - " + keperluan);
    }
}
