package CaseMethod2;

public class RiwayatTransaksi {
    TransaksiLayanan[] data; //menyimpan objek-objek transaksi layanan
    int size;
    //NodePasien head, tail;

    public RiwayatTransaksi(int kapasitas) { //menentukan jumlah array
        data = new TransaksiLayanan[kapasitas]; //membuat array baru untuk transaksi layanan sbnyk kapasitas
        size = 0; //nilai default 
    }

    public void tambah(TransaksiLayanan trl) {
        if (size < data.length) { //apakah size memenuhi kapasitas data.length dan mengecek apakah array sdh penuh apa blm
            data[size++] = trl; //menambahkan size ketika data sdh terisi, lalu disimpan ke objek
        }
    }

    public void tampilkan() {
        if (isEmpty()){ //mengecek kosong apa tdk
            System.out.println("Belum ada transaksi");
            return;
        }
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < size; i++) { //mengecek size yg ada di array
            data[i].tampilkanTransaksi(); //menampilkan data transaksi dlm array
        }
    }
    public boolean isEmpty() { 
        return size == 0;
    }
}