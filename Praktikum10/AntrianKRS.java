package Praktikum10;

public class AntrianKRS {
    int maxAntrian = 10;
    int maxProses = 30;
    Mahasiswa[] antrian = new Mahasiswa[maxAntrian];
    int front = 0;
    int rear = 0;
    int jumlahDiproses = 0;

    public boolean isKosong() {
        return rear == front;
    }

    public boolean isPenuh() {
        return rear >= maxAntrian;
    }

    public void kosongkanAntrian() {
        front = 0;
        rear = 0;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (!isPenuh()) {
            antrian[rear] = mhs;
            rear++;
            System.out.println(" Mahasiswa berhasil ditambahkan ke antrian.");
        } else {
            System.out.println(" Antrian penuh. Tidak bisa menambahkan mahasiswa.");
        }
    }

    public void panggilAntrian() {
        if ((rear - front) < 2) {
            System.out.println(" Antrian kurang dari 2. Tidak bisa memproses.");
            return;
        }

        for (int i = 0; i < 2 && jumlahDiproses < maxProses; i++) {
            Mahasiswa mhs = antrian[front];
            System.out.println(" Memproses: " + mhs);
            front++;
            jumlahDiproses++;
        }
    }

    public void tampilSemua() {
        if (isKosong()) {
            System.out.println(" Antrian kosong.");
        } else {
            System.out.println(" Daftar antrian:");
            for (int i = front; i < rear; i++) {
                System.out.println((i - front + 1) + ". " + antrian[i]);
            }
        }
    }

    public void tampilTerdepan() {
        System.out.println(" Dua antrian terdepan:");
        int batas = Math.min(2, rear - front);
        for (int i = 0; i < batas; i++) {
            System.out.println((i + 1) + ". " + antrian[front + i]);
        }
    }

    public void tampilTerakhir() {
        if (isKosong()) {
            System.out.println(" Antrian kosong.");
        } else {
            System.out.println(" Antrian terakhir: " + antrian[rear - 1]);
        }
    }

    public int jumlahAntrian() {
        return rear - front;
    }

    public int getJumlahDiproses() {
        return jumlahDiproses;
    }

    public int getJumlahBelumDiproses() {
        return Math.max(0, maxProses - jumlahDiproses);
    }
}
