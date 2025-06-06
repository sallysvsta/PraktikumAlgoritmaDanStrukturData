package Praktikum12;
public class DoubleLinkedLists {
        Node01 head;
        Node01 tail;
        int size;
    
    public DoubleLinkedLists() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        return size;
    }
    public void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void add(int index, Mahasiswa01 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node01 newNode = new Node01(data);
            Node01 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }
    public void removeAfter(String keyNim) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " yang dapat dihapus.");
            return;
        }
        Node01 toRemove = current.next;
        current.next = toRemove.next;
        if (toRemove.next != null) {
            toRemove.next.prev = current;
        } else {
            tail = current; 
        }
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        toRemove.data.tampil();
        size--;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }
        Node01 removed;
        if (index == 0) {
            removed = head;
            removeFirst();
        } else if (index == size - 1) {
            removed = tail;
            removeLast();
        } else {
            Node01 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            removed = current;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
        System.out.println("Data pada index " + index + " berhasil dihapus:");
        removed.data.tampil();
    }
    public void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node01 newNode = new Node01(data);
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
        System.out.println("Node berhenti disisipkan setelah NIM " + keyNim);
    }
    public void print() {
        if (isEmpty()) {
        System.out.println("Linked list masih kosong.");
        return;
    }
        Node01 current = head;
        System.out.println("Isi data: ");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        System.out.println("Jumlah data: " + size);
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Node01 removed = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        removed.data.tampil();
        size--;
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Node01 removed = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        removed.data.tampil();
        size--;
    }
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data pertama:");
            head.data.tampil();
        }
    }
    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        }
    }
    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }
        Node01 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }
    public Node01 search(String nim) {
        Node01 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}