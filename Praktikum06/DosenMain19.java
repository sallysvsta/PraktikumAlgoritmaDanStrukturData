package Praktikum06;
import java.util.Scanner;
public class DosenMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 list = new DataDosen19();
        int pilih;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda)");
            System.out.println("5. Sorting DSC pakai Insertion Sort");
            System.out.println("6. Pencarian Data Berdasarkan Nama (Sequential Search)");
            System.out.println("7. Pencarian Data Berdasarkan Usia (Binary Search)");
            System.out.println("8. Exit");

            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch(pilih){
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    Dosen19 dsn = new Dosen19(kode, nama, jenisKelamin, usia);
                    list.tambah(dsn);
                    break;

                case 2:
                    System.out.println("Data Dosen:");
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("Data setelah Bubble Sort ASC:");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data setelah Selection Sort DSC:");
                    list.tampil();
                    break;

                case 5:
                    list.insertionSort();
                    System.out.println("Data setelah Insertion Sort DSC:");
                    list.tampil();
                    break;
                    
                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    list.pencarianDataSequential(cariNama);
                    break;
                
                case 7:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    list.pencarianDataBinary(cariUsia);
                    break;

                case 8:
                    System.out.println("Keluar program...");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while(pilih != 8);
    }
}