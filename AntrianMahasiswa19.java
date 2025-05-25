package TugasJobsheet11;
public class AntrianMahasiswa19 {
    NodeMahasiswa19 front;
    NodeMahasiswa19 rear;
    int size = 0;
    int kapasitas;

    AntrianMahasiswa19(int kapasitas) {
        this.kapasitas = kapasitas;
        this.front = this.rear = null;
    }
    boolean isEmpty() {
        return front == null;
    }
    boolean isFull() {
        return size >= kapasitas;
    }

    void enqueue(Mahasiswa19 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambahkan mahasiswa.");
            return;
        }

        NodeMahasiswa19 newNode = new NodeMahasiswa19(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
            return;
        }

        System.out.println("Memanggil: " + front.data);
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    void tampilkanDepanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa di depan: " + front.data);
        System.out.println("Mahasiswa di belakang: " + rear.data);
    }

    void tampilkanJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    void kosongkanAntrian() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar mahasiswa dalam antrian:");
        NodeMahasiswa19 current = front;
        int i = 1;
        while (current != null) {
            System.out.println(i++ + ". " + current.data);
            current = current.next;
        }
    }
}

