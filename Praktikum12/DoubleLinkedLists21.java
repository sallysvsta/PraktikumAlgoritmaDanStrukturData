package Praktikum12;

public class DoubleLinkedLists21 {
    Node21 head;
    Node21 tail;
    int size;

    public DoubleLinkedLists21() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa21 data) {
        Node21 newNode = new Node21(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa21 data) {
        Node21 newNode = new Node21(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa21 data) {
        Node21 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + "tidak ditemukan");
            return;
        }

        Node21 newNode = new Node21(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("Peringatan: Linked list masih kosong.");
        } else {
            System.out.println("Isi data dalam linked list:");
            Node21 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public Node21 search(String nim) {
        Node21 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa21 dataTerhapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa21 dataTerhapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }

    public void add(int index, Mahasiswa21 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node21 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }

        if (current.next == null) {
            addLast(data);
        } else {
            Node21 newNode = new Node21(data);
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus.");
            return;
        }

        Node21 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " yang bisa dihapus.");
            return;
        }

        Node21 nodeToDelete = current.next;
        Mahasiswa21 dataTerhapus = nodeToDelete.data;

        if (nodeToDelete == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = nodeToDelete.next;
            nodeToDelete.next.prev = current;
        }
        size--;
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus. Data yang dihapus:");
        dataTerhapus.tampil();
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus.");
            return;
        }

        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node21 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }

        Mahasiswa21 dataTerhapus = current.data;

        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Node pada indeks ke-" + index + " berhasil dihapus. Data yang dihapus:");
            dataTerhapus.tampil();
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data di head.");
        } else {
            System.out.println("Data pada node pertama (head):");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data di tail.");
        } else {
            System.out.println("Data pada node terakhir (tail):");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data.");
            return;
        }

        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        Node21 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Indeks melebihi jumlah node dalam list.");
        } else {
            System.out.println("Data pada indeks ke-" + index + ":");
            current.data.tampil();
        }
    }

    public int size() {
        return size;
    }
}