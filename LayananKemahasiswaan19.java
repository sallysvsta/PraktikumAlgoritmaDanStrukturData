package TugasJobsheet11;
import java.util.Scanner;
public class LayananKemahasiswaan19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianMahasiswa19 antrian = new AntrianMahasiswa19(10); 

        int pilihan;
        do {
            System.out.println("\n===== MENU ANTRIAN KEMAHASISWAAN =====");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Depan & Belakang");
            System.out.println("4. Cek Jumlah Mahasiswa dalam Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh. Tidak bisa menambahkan mahasiswa.");
                        break;
                    }
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = scanner.nextLine();

                    Mahasiswa19 mhs = new Mahasiswa19(nama, nim, keperluan);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilkanDepanBelakang();
                    break;
                case 4:
                    antrian.tampilkanJumlah();
                    break;
                case 5:
                    antrian.kosongkanAntrian();
                    break;
                case 6:
                    antrian.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        scanner.close();
    }
}

