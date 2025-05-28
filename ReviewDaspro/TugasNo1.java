package ReviewDaspro;
import java.util.Scanner;
public class TugasNo1 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] KODE = {'A', 'B', 'D', 'E', 'G', 'H', 'L', 'N', 'S', 'T'};

        String[] KOTA = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SURABAYA", "MALANG", "SEMARANG", "TEGAL"
        };
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = input.next().toUpperCase().charAt(0);

        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println("Kota dengan plat " + inputKode + " adalah: " + KOTA[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
