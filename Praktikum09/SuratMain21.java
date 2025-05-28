import java.util.Scanner;

public class SuratMain21 {
    public static void main(String[] args) {
        StackSurat21 stack = new StackSurat21(10); 
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("=== INPUT SURAT IZIN ===");
                    System.out.print("ID Surat: ");
                    String idSurat = sc.next();
                    System.out.print("Nama Mahasiswa: ");
                    sc.nextLine(); 
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.next();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = sc.next().charAt(0);
                    sc.nextLine();
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();

                    Surat21 suratBaru = new Surat21(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(suratBaru);
                    break;

                case 2:
                    System.out.println("=== PROSES SURAT IZIN ===");
                    Surat21 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat yang diproses:");
                        suratDiproses.tampilkanSurat11();
                    }
                    break;

                case 3:
                    System.out.println("=== LIHAT SURAT IZIN TERAKHIR ===");
                    Surat21 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        suratTerakhir.tampilkanSurat11();
                    }
                    break;

                case 4:
                    System.out.println("=== CARI SURAT IZIN ===");
                    System.out.print("Masukkan nama mahasiswa: ");
                    sc.nextLine();
                    String namaCari = sc.nextLine();
                    stack.cariSurat(namaCari);
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}