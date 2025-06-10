package TugasJobsheet10;
import java.util.Scanner;
public class PersetujuanKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Kartu Rencana Studi ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 Mahasiswa untuk KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Jumlah Antrian Saat Ini");
            System.out.println("7. Jumlah yang Sudah Diproses KRS");
            System.out.println("8. Sisa Mahasiswa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.jumlahDiproses() >= 30) {
                        System.out.println("Semua mahasiswa telah melakukan KRS.");
                        break;
                    }
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.prosesKRS();
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                   antrian.tampilkanTerakhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah melakukan KRS: " + antrian.jumlahDiproses());
                    break;
                case 8:
                    System.out.println("Jumlah belum KRS: " + antrian.sisaBelumKRS());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
    }