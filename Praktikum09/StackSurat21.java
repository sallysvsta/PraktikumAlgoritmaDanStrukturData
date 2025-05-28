public class StackSurat21 {
    Surat21[] stack; 
    int top;        
    int kapasitas;  

   public StackSurat21(int kapasitas) {
       this.kapasitas = kapasitas;
       this.stack = new Surat21[kapasitas];
       this.top = -1; 
   }

   
   public boolean isFull() {
       return top == kapasitas - 1;
   }

   
   public boolean isEmpty() {
       return top == -1;
   }

   
   public void push(Surat21 surat) {
       if (isFull()) {
           System.out.println("Stack penuh! Tidak dapat menambahkan surat.");
       } else {
           stack[++top] = surat;
           System.out.println("Surat berhasil diterima!");
       }
   }

   
   public Surat21 pop() {
       if (isEmpty()) {
           System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
           return null;
       } else {
           return stack[top--];
       }
   }

   
   public Surat21 peek() {
       if (isEmpty()) {
           System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
           return null;
       } else {
           return stack[top];
       }
   }


   public void cariSurat(String namaMahasiswa) {
       boolean ditemukan = false;
       for (int i = 0; i <= top; i++) {
           if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
               stack[i].tampilkanSurat11();
               ditemukan = true;
           }
       }
       if (!ditemukan) {
           System.out.println("Surat dengan nama mahasiswa " + namaMahasiswa + " tidak ditemukan.");
       }
   }
}


