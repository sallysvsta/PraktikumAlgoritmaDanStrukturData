package Praktikum01;
import java.util.Scanner;
public class Fungsi {

        private static int[][] stockBunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };
    
        private static int[] hargaBunga = {75000, 50000, 60000, 10000};
    
        private static int[] penguranganStock = {-1, -2, 0, -5}; 
    
        public static void main(String[] args) {
            tampilkanPendapatanCabang();
    
            tampilkanStokCabang(3); 
        }
    
        public static void tampilkanPendapatanCabang() {
            System.out.println("Pendapatan Setiap Cabang:");
            for (int i = 0; i < stockBunga.length; i++) {
                int pendapatan = 0;
                for (int j = 0; j < stockBunga[i].length; j++) {
                    pendapatan += (stockBunga[i][j] + penguranganStock[j]) * hargaBunga[j];
                }
                System.out.println("RoyalGarden " + (i + 1) + ": Rp" + pendapatan);
            }
            System.out.println();
        }
    
        public static void tampilkanStokCabang(int indexCabang) {
            System.out.println("Stok Bunga di RoyalGarden " + (indexCabang + 1) + ":");
            String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
            for (int i = 0; i < stockBunga[indexCabang].length; i++) {
                System.out.println(jenisBunga[i] + ": " + (stockBunga[indexCabang][i] + penguranganStock[i]));
            }
            System.out.println();
        }
    }