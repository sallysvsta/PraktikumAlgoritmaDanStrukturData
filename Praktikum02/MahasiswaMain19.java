package Praktikum02;
public class MahasiswaMain19 {
    public static void main(String[] args) {
        Mahasiswa19 mhsl = new Mahasiswa19();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2241720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SI 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        Mahasiswa19 mhs2 = new Mahasiswa19("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa19 mhsSeli = new Mahasiswa19("Sally Savista Anindya", "244107060064", 3.58, "SIB 1D");
        mhsSeli.tampilkanInformasi();
    }
}

