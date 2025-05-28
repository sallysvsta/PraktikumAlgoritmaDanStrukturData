package Praktikum07;

public class DataDosen21 {
    Dosen21[] listDsn;
    int idx = 0;

    public  DataDosen21 (int jumlah) {
        listDsn = new Dosen21[jumlah];
    }

    void tambah(Dosen21 m) {
        if (idx < listDsn.length) {
            listDsn[idx] = m;
            idx++;

        } else {
            System.out.println("Data penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak ada data dosen yang tersimpan.");
            return;
        }

        for (int i = 0; i < idx; i++) {
            listDsn[i].tampil();
        }
    }

    void sortingASC() {
        if (idx <= 1) {
            System.out.println("Data belum cukup untuk diurutkan!");
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDsn[j].usia < listDsn[j - 1].usia) {
                    Dosen21 tmp = listDsn[j];
                    listDsn[j] = listDsn[j - 1];
                    listDsn[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        if (idx <= 1) {
            System.out.println("Data belum cukup untuk diurutkan!");
            return;
        }

        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (listDsn[j].usia > listDsn[idxMax].usia) {
                    idxMax = j;
                }
            }

            Dosen21 tmp = listDsn[idxMax];
            listDsn[idxMax] = listDsn[i];
            listDsn[i] = tmp;
        }
    }

    void insertionSort() {
        if (idx <= 1) {
            System.out.println("Data belum cukup untuk diurutkan!");
            return;
        }

        for (int i = 1; i < idx; i++) {
            Dosen21 temp = listDsn[i];
            int j = i;
            while (j > 0 && listDsn[j - 1].usia < temp.usia) {
                listDsn[j] = listDsn[j - 1];
                j--;
            }
            listDsn[j] = temp;
        }
    }

    void pencarianDataSequential(String cariNama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (listDsn[i].nama.equalsIgnoreCase(cariNama)) {
                listDsn[i].tampil();
                count++;
            }
        }
        
        if (count > 1) {
            System.out.println("! Peringatan: Terdapat lebih dari 1 hasil pencarian untuk nama tersebut !");
        } else if (count == 0) {
            System.out.println("Data dosen dengan nama " + cariNama + " tidak ditemukan.");
        }
    }

    int binarySearch(int cariUsia, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (listDsn[mid].usia == cariUsia) {
                return mid;
            } else if (listDsn[mid].usia > cariUsia) {
                return binarySearch(cariUsia, left, mid - 1);
            } else {
                return binarySearch(cariUsia, mid + 1, right);
            }
        }
        return -1;
    }

    void pencarianDataBinary(int cariUsia) {
        sortingASC();  
        int hasil = binarySearch(cariUsia, 0, idx - 1);
        if (hasil != -1) {
            listDsn[hasil].tampil();
        } else {
            System.out.println("Data dosen dengan usia " + cariUsia + " tidak ditemukan.");
        }
    }
}
