package TugasJobsheet10;
public class AntrianKRS {
   Mahasiswa[] data;
   int front;
   int rear;
   int size;
   int max;
   int jumlahDiproses = 0;
   
   public AntrianKRS(int max) {
    this.max = max;
    this.data = new Mahasiswa[max];
    this.front = 0;
    this.rear = -1;
    this.size = 0;
   }
   public boolean isEmpty() {
    if (size == 0) {
        return true;
    } else {
        return false;
    }
   }
   public boolean isFull() {
    if (size == max) {
        return true;
    } else {
        return false;
    }
   }
   public void peek() {
    if (!isEmpty()) {
        System.out.println("Antrian terdepan: " + data[front]);
    } else {
        System.out.println("Antrian masih kosong");
    }
   }
   public void print() {
    if (isEmpty()) {
        System.out.println("Antrian masih kosong");
    } else {
        int i = front;
        while (i != rear) {
            System.out.println(data[i] + " ");
            i = (i + 1) % max;
        }
        System.out.println(data[i] + " ");
        System.out.println("Jumlah antrian = " + size);
    }
   }
   public void clear() {
    if (!isEmpty()) {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    } else {
        System.out.println("Antrian masih kosong");
    }
   }
    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa memproses KRS.");
            return;
        }
        System.out.println("Memproses dua mahasiswa: ");
        for (int i = 0; i < 2; i ++) {
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        jumlahDiproses++;
        mhs.tampilkanData();
    }
}
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void tampilkanDuaTerdepan() {
        if (size < 2) {
            System.out.println("Belum ada 2 mahasiswa dalam antrian.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }
    public void tampilkanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa paling akhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public int jumlahAntrian() {
        return size;
    }
    public int jumlahDiproses() {
        return jumlahDiproses;
    }
    public int sisaBelumKRS() {
        return 30 - jumlahDiproses;
    }
}