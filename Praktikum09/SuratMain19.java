package Praktikum09;
import java.util.Scanner;
public class SuratMain19 {
    public static void main(String[] args) {
    StackSurat19 stack = new StackSurat19(5);
    Scanner scan = new Scanner(System.in);
    
    int pilih;
    do {
       System.out.println("\nMenu");
       System.out.println("1. Terima Surat Izin");
       System.out.println("2. Proses Surat Izin");
       System.out.println("3. Lihat Surat Izin Terakhir");
       System.out.println("4. Cari Surat Berdasarkan Nama"); 
       System.out.print("Pilih: ");
       pilih = scan.nextInt();
       scan.nextLine();
       switch (pilih) {
        case 1:
            System.out.print("ID Surat: ");
            String idSurat = scan.nextLine();
            System.out.print("Nama Mahasiswa: ");
            String namaMahasiswa = scan.nextLine();
            System.out.print("Kelas: ");
            String kelas = scan.nextLine();
            System.out.print("Jenis Izin (Sakit/Izin): ");
            char jenis = scan.next().charAt(0);
            System.out.print("Durasi (hari): ");
            int durasi = scan.nextInt();

            Surat19 surat = new Surat19(idSurat, namaMahasiswa, kelas, jenis, durasi);
            stack.push(surat);
            break;

        case 2:
            Surat19 diproses = stack.pop();
            if (diproses != null) {
                System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                System.out.println("Jenis Izin: " + diproses.jenisIzin);
                System.out.println("Durasi: " + diproses.durasi + " hari");
            }
            break;

        case 3:
            Surat19 terakhir = stack.peek();
            if (terakhir != null) {
                System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
            }
            break;

        case  4:
            System.out.print("Masukkan nama mahasiswa: ");
            String cari = scan.nextLine();
            boolean ditemukan = stack.cariSurat(cari);
            if (ditemukan) {
                System.out.println("Surat dari " + cari + " ditemukan");
            } else {
                System.out.println("Surat tidak ditemukan!");
            }
            break;
        default:
            System.out.println("Pilihan tidak valid");
       }
    } while (pilih >= 1 && pilih <= 4);
    }
}