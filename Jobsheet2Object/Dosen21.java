package Jobsheet2Object;
public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
        System.out.println("ID Dosen: "+ idDosen);
        System.out.println("Nama Lengkap:  " + nama);
        System.out.println("Status Aktif: "+ statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);

    }

    void setStatusAktif(boolean status){
        this.statusAktif = status;
        if (status) {
            System.out.println("Dosen telah diaktifkan.");
        } else {
            System.out.println("Dosen dinonaktifkan.");
        }
    }

    public boolean getStatusAktif() {
        return statusAktif;
    }

    int hitungMasaKerja (int thnSkrg){
        if (thnSkrg < tahunBergabung) {
            System.out.println("Error: Tahun saat ini tidak bisa lebih kecil dari tahun bergabung.");
            return -1; 
        }
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;

    }

    public Dosen21() {

    }

    public Dosen21(String id, String nm, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        idDosen = id;
        nama = nm;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}


    
