package Praktikum_A;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);

        char pilih;
        do {
            System.out.print("Judul: ");
            String judul = sc.nextLine();
            System.out.print("Pengarang: ");
            String pengarang = sc.nextLine();
            System.out.print("Jumlah halaman: ");
            int jumlahHalaman = sc.nextInt();
            System.out.print("Tahun terbit: ");
            int tahunTerbit = sc.nextInt();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Buku b = new Buku(judul, pengarang, jumlahHalaman, tahunTerbit, harga);
            System.out.print("Apakah anda ingin menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(b);
        } while (pilih == 'y');
        stk.print();;
        stk.pop();;
        stk.peek();
        stk.print();
    }
}
