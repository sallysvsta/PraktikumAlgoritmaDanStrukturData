package CaseMethod2;
public class LinkedListPasien {
    NodePasien head;

    public void tambahPasien(Pasien p) {
        NodePasien baru = new NodePasien(p);
        if (head == null) {
            head = baru;
        } else {
            NodePasien temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println(">> Tidak ada pasien dalam antrian.");
            return;
        }

        System.out.println("-- Antrian Pasien --");
        NodePasien temp = head;
        while (temp != null) {
            temp.data.tampilkanInformasi();
            temp = temp.next;
        }
    }

    public Pasien layaniPasien() {
        if (head == null) return null;
        Pasien p = head.data;
        head = head.next;
        return p;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int sisaAntrian() {
        int count = 0;
        NodePasien temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}