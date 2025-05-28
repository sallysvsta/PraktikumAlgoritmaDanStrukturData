package ReviewDaspro;
import java.util.Scanner;
public class Fungsi {
        // Data stock bunga per cabang
        static int[][] stock = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };
    
        static int[] harga = {75000, 50000, 60000, 10000};  
    
        static int[] pengurangan = {-1, -2, 0, -5};
    
        public static int[] hitungPendapatan(int[][] stock, int[] harga) {
            int[] pendapatan = new int[stock.length];
    
            for (int i = 0; i < stock.length; i++) {
                int total = 0;
                for (int j = 0; j < stock[i].length; j++) {
                    total += stock[i][j] * harga[j];
                }
                pendapatan[i] = total;
            }
            return pendapatan;
        }
    
        public static int[] hitungTotalStock(int[][] stock) {
            int[] totalStock = new int[stock[0].length];
    
            for (int i = 0; i < stock.length; i++) {
                for (int j = 0; j < stock[i].length; j++) {
                    totalStock[j] += stock[i][j];
                }
            }
            return totalStock;
        }
    
        public static void kurangiStock(int[][] stock, int[] pengurangan) {
            for (int i = 0; i < stock.length; i++) {
                for (int j = 0; j < stock[i].length; j++) {
                    stock[i][j] += pengurangan[j];  
                    if (stock[i][j] < 0) {
                        stock[i][j] = 0;  
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            int[] pendapatan = hitungPendapatan(stock, harga);
            System.out.println("Pendapatan tiap cabang jika semua bunga terjual:");
            for (int i = 0; i < pendapatan.length; i++) {
                System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan[i]);
            }
    
            int[] totalStockSebelum = hitungTotalStock(stock);
            System.out.println("\nTotal stock tiap jenis bunga sebelum pengurangan:");
            System.out.println("Aglonema: " + totalStockSebelum[0]);
            System.out.println("Keladi: " + totalStockSebelum[1]);
            System.out.println("Alocasia: " + totalStockSebelum[2]);
            System.out.println("Mawar: " + totalStockSebelum[3]);
    
            kurangiStock(stock, pengurangan);
    
            int[] totalStockSesudah = hitungTotalStock(stock);
            System.out.println("\nTotal stock tiap jenis bunga setelah pengurangan:");
            System.out.println("Aglonema: " + totalStockSesudah[0]);
            System.out.println("Keladi: " + totalStockSesudah[1]);
            System.out.println("Alocasia: " + totalStockSesudah[2]);
            System.out.println("Mawar: " + totalStockSesudah[3]);
        }
    }