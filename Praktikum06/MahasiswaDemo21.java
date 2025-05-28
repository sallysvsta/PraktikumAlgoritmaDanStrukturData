package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jumlah mahasiswa: ");
            int jumlahMahasiswa = sc.nextInt();
            sc.nextLine(); 
    
            MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21(jumlahMahasiswa);
    
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
                System.out.print("NIM: ");
                String nim = sc.nextLine();
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("IPK: ");
                double ipk = sc.nextDouble();
                sc.nextLine(); 
    
                Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
                list.tambah(m);
            }
    
            System.out.println("Data mahasiswa sebelum sorting:");
            list.tampil();
    
            System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) menggunakan Bubble Sort:");
            list.bubbleSort();
            list.tampil();
    
            System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC) menggunakan Selection Sort:");
            list.SelectionSort();
            list.tampil();
    
            System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC) menggunakan Insertion Sort:");
            list.insertionSort();
            list.tampil();
        }
    }