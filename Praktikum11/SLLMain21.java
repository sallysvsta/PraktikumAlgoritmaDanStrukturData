package Praktikum11;

import java.util.Scanner;

public class SLLMain21 {
    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21();

        Mahasiswa21 mhs1 = new Mahasiswa21("21212203", "Dirga", "4D", 3.6);
        Mahasiswa21 mhs2 = new Mahasiswa21("22212202", "Cintia", "3C", 3.5);
        Mahasiswa21 mhs3 = new Mahasiswa21("23212201", "Bimon", "2B", 3.8);
        Mahasiswa21 mhs4 = new Mahasiswa21("24212200", "Alvaro", "1A", 4.0);

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("data index 1 : ");
        sll.getData(1); 

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
