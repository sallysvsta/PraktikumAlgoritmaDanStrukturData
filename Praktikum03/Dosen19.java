package Praktikum03;
public class Dosen19 {
        String kode;
        String nama;
        boolean jenisKelamin; 
        int usia;

        public Dosen19() {
        }
    
        public Dosen19(String kode, String nama, boolean jenisKelamin, int usia) {
            this.kode = kode;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.usia = usia;
        }

        void tampilkanData() {
            System.out.println("Kode            : " + this.kode);
            System.out.println("Nama            : " + this.nama);
            System.out.println("Jenis Kelamin   : " + (this.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + this.usia);
        }
    }

    
    