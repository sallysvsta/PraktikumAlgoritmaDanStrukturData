package Praktikum03;
import java.util.Scanner;
public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen19[] arrayOfDosen = new Dosen19[3];
    
        for(int i = 0; i < 3; i++) {
           
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine().toUpperCase();
            boolean jenisKelamin = jk.equals("L");
            if (jk.equals("P")) {
                jenisKelamin = false;
            }
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");

            arrayOfDosen[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("--------------------------------------");
        }
    }
}