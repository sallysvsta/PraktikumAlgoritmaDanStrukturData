package Praktikum02;
public class MahasiswaMainModif19 {
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

        mhsl.updateIpk(5.0); 
        mhsl.tampilkanInformasi(); 

        Mahasiswa19 mhs2 = new Mahasiswa19();
        mhs2.nama = "Annisa Nabila";
        mhs2.nim = "2141720160";
        mhs2.kelas = "TI 2L";
        mhs2.ipk = 3.25;

        mhs2.updateIpk(3.30); 
        mhs2.tampilkanInformasi();

        mhs2.updateIpk(-1.0); 
        mhs2.tampilkanInformasi(); 
    }
}