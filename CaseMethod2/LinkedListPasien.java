package CaseMethod2;
public class LinkedListPasien {
    NodePasien head, tail;

    public void tambahPasien(Pasien p) {
        NodePasien baru = new NodePasien(p); //membuat objek baru dr kls nodepasien
        if (head == null) { //mengecek apakah ada isinya
            head = tail = baru; //menambahkan node baru 
        } else {
            tail.next = baru; //meletakkan node baru stlh tail
            tail = baru; //tail pindah ke node baru
        }
    }

    public void tampilkanAntrian() {
        if (head == null) { //cek apakah ada node
            System.out.println(">> Tidak ada pasien dalam antrian.");
            return;
        }

        System.out.println("-- Antrian Pasien --");
        NodePasien temp = head; //head disimpan ke temp //temp tampungan sementara
        while (temp != null) { 
            temp.data.tampilkanInformasi(); //menampilkan informasi
            temp = temp.next; 
        }
    }

    public Pasien layaniPasien() {
        if (head == null) return null;
        Pasien p = head.data; //mengambil data pasien yg plg dpn
        head = head.next; //head pindah ke data selanjutnya
        if (head == null) 
        tail = null;
        return p;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int sisaAntrian() {
        int count = 0; 
        NodePasien temp = head; //menyimpan sementara
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}