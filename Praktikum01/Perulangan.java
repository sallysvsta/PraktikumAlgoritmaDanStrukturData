package Praktikum01;
import java.util.Scanner;
public class Perulangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.println("n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; 
            }

            if (i % 2 == 1) {
                System.out.print("*"); 
            } else {
                System.out.print(i); 
            }

            if (i < n && i != 5 && i != 9) {
                System.out.print(" "); 
            }
        }

        System.out.println(); 
    }
}