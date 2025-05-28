public class StackTugasMahasiswa21 {
    Mahasiswa21[] stack;
    int top;
    int size;

    public StackTugasMahasiswa21(int size) {
        this.size = size;
        stack = new Mahasiswa21[size];
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

    public void push(Mahasiswa21 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa21 pop() {
        if (!isEmpty()){
            Mahasiswa21 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa21 peek(){
        if (!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa21 bottom() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    
    public int jumlahTugas() {
        return top + 1;
    }
    public String konversiDesimalKeBiner(int nilai) {
    if (nilai == 0) return "0";
    StringBuilder biner = new StringBuilder();
    while (nilai != 0) {
        biner.insert(0, nilai % 2);
        nilai /= 2;
    }
    return biner.toString();
}
    
}