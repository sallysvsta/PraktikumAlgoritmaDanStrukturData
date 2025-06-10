package Praktikum06;
public class DataDosen19 {
    Dosen19[] dataDosen = new Dosen19[10];
    int idx = 0;

    void tambah(Dosen19 dsn){
        if (idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++){
            dataDosen[i].tampil();
            System.out.println("--------------------------------");
        }
    }

    void SortingASC(){
        for (int i = 0; i < idx - 1; i++){
            for (int j = 0; j < idx - i - 1; j++){
                if (dataDosen[j].usia > dataDosen[j+1].usia){
                    Dosen19 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j+1];
                    dataDosen[j+1] = temp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 0; i < idx - 1; i++){
            int idxMax = i;
            for (int j = i+1; j < idx; j++){
                if (dataDosen[j].usia > dataDosen[idxMax].usia){
                    idxMax = j;
                }
            }
            Dosen19 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < idx; i++){
            Dosen19 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j-1].usia < temp.usia){
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
    void pencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                if (!ditemukan) {
                    System.out.println("Data ditemukan:");
                }
                dataDosen[i].tampil();
                System.out.println("--------------------------------");
                ditemukan = true;
                jumlahDitemukan++;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama '" + nama + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("PERINGATAN: Ditemukan lebih dari 1 dosen dengan nama yang sama!");
        }
    }
    void pencarianDataBinary(int usia) {
        SortingASC();
    
        int left = 0, right = idx - 1;
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == usia) {
                int i = mid;
                while (i >= 0 && dataDosen[i].usia == usia) {
                    i--;
                }
                i++;
                while (i < idx && dataDosen[i].usia == usia) {
                    if (!ditemukan) {
                        System.out.println("Data ditemukan:");
                    }
                    dataDosen[i].tampil();
                    System.out.println("--------------------------------");
                    ditemukan = true;
                    jumlahDitemukan++;
                    i++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        if (!ditemukan) {
            System.out.println("Data dosen dengan usia '" + usia + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("PERINGATAN: Ditemukan lebih dari 1 dosen dengan usia yang sama!");
        }
    }
}