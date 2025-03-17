package BruteForceDivideConquer.minggu5;
import java.util.Scanner;
public class TugasJS5 {
        public static int cariMaxUTS(int[] uts, int kiri, int kanan) {
            if (kiri == kanan) {
                return uts[kiri]; 
            }
    
            int tengah = (kiri + kanan) / 2;
            int maxKiri = cariMaxUTS(uts, kiri, tengah);
            int maxKanan = cariMaxUTS(uts, tengah + 1, kanan);
    
            return Math.max(maxKiri, maxKanan);
        }
    
        public static int cariMinUTS(int[] uts, int kiri, int kanan) {
            if (kiri == kanan) {
                return uts[kiri]; 
            }
    
            int tengah = (kiri + kanan) / 2;
            int minKiri = cariMinUTS(uts, kiri, tengah);
            int minKanan = cariMinUTS(uts, tengah + 1, kanan);
    
            return Math.min(minKiri, minKanan);
        }
    
        public static double hitungRataUAS(int[] uas) {
            int total = 0;
            for (int nilai : uas) {
                total += nilai;
            }
            return (double) total / uas.length;
        }
    
        public static void main(String[] args) {
           
            int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
            int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
    
            int maxUTS = cariMaxUTS(nilaiUTS, 0, nilaiUTS.length - 1);
            System.out.println("Nilai UTS tertinggi: " + maxUTS);
    
            int minUTS = cariMinUTS(nilaiUTS, 0, nilaiUTS.length - 1);
            System.out.println("Nilai UTS terendah: " + minUTS);
    
            double rataUAS = hitungRataUAS(nilaiUAS);
            System.out.println("Rata-rata nilai UAS: " + rataUAS);
        }
    }
    

