package Praktikum05;
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
}
