package Praktikum11;
import java.util.Scanner;
public class SLLMain19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList19 sll = new SingleLinkedList19();

    Mahasiswa19 mhs1 = new Mahasiswa19("24212200", "Alvaro", "1A", 4.0);
    Mahasiswa19 mhs2 = new Mahasiswa19("23212201", "Bimon", "2B", 3.8);
    Mahasiswa19 mhs3 = new Mahasiswa19("22212202", "Cintia", "3C", 3.5);
    Mahasiswa19 mhs4 = new Mahasiswa19("21212203", "Dirga", "4D", 3.6);

    sll.addLast(mhs1);
    sll.addLast(mhs3);
    sll.addLast(mhs2);

    System.out.println("Data Index 1: ");
    sll.getData(1);

    System.out.println("Data Mahasiswa an Bimon berada pada index : "+sll.indexOf("Bimon"));
    System.out.println();

    sll.removeFirst();

    sll.print();
    sll.removeFirst();

    sll.print();
}
}