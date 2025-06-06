package Praktikum09;
public class StackSurat19 {
    Surat19[] stack;
    int top;
    int size;

    public StackSurat19(int size) {
        this.size = size;
        stack = new Surat19[size];
        top = -1;
}
public boolean isFull() {
    if (top == size - 1) {
        return true;
    } else {
        return false;
    }
}
public boolean isEmpty() {
    if (top == -1) {
        return true;
    } else {
        return false;
    }
}
public void push(Surat19 s) {
    if (!isFull()) {
        top++;
        stack[top] = s;
    } else {
        System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
    }
}
public Surat19 pop() {
    if (!isEmpty()) {
        Surat19 s = stack[top];
        top--;
        return s;
    } else {
        System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
        return null;
    }
}
public Surat19 peek() {
    if (!isEmpty()) {
        return stack[top];
    } else {
        System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
        return null;
    }
}
public boolean cariSurat(String nama) {
    for (int i = 0; i <= top; i++) {
        if (stack[i].namaMahasiswa.equals(nama)) {
            return true;
        }
    }
    return false;
}
}
