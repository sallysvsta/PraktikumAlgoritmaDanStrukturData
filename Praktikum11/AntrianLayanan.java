package Praktikum11;

public class AntrianLayanan {
    private Mahasiswa front, rear;
    private int size;

    public AntrianLayanan() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void enqueue(String nama, String nim) {
        Mahasiswa baru = new Mahasiswa(nama, nim);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println(nama + " (" + nim + ") berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
        } else {
            System.out.println("Memanggil " + front.nama + " (" + front.nim + ") dari antrian.");
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    public void tampilkanDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan: " + front.nama + " (" + front.nim + ")");
        }
    }

    public void tampilkanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir: " + rear.nama + " (" + rear.nim + ")");
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            Mahasiswa current = front;
            int i = 1;
            while (current != null) {
                System.out.println(i + ". " + current.nama + " (" + current.nim + ")");
                current = current.next;
                i++;
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void kosongkanAntrian() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}
