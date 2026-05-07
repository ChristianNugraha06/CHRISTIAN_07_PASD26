package jobsheet9;

public class StackSurat07 {
     Surat07[] stack;
    int size;
    int top;
 
    public StackSurat07(int size) {
        this.size = size;
        stack = new Surat07[size];
        top = -1;
    }
 
    public boolean isFull() {
        return top == size - 1;
    }
 
    public boolean isEmpty() {
        return top == -1;
    }
 
    public void push(Surat07 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }
 
    public Surat07 pop() {
        if (!isEmpty()) {
            Surat07 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }
 
    public Surat07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat   : " + stack[i].idSurat);
                System.out.println("Nama       : " + stack[i].namaMahasiswa);
                System.out.println("Kelas      : " + stack[i].kelas);
                System.out.println("Jenis Izin : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin"));
                System.out.println("Durasi     : " + stack[i].durasi + " hari");
                return true;
            }
        }
        System.out.println("Surat atas nama \"" + nama + "\" tidak ditemukan.");
        return false;
    }
}
