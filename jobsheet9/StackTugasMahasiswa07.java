package jobsheet9;

public class StackTugasMahasiswa07 {

    Mahasiswa07[] stack;
    int size;
    int top;

    public StackTugasMahasiswa07(int size){
        this.size = size;
        stack = new Mahasiswa07[size];
        top = -1;

    }
    
    public boolean isfull(){
        if (top == size-1) {
            return true;
        } else {

        } return false;
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    public void push (Mahasiswa07 mhs){
        if (!isfull()) {
            top++;
            stack [top] = mhs;
        } else{
            System.out.println("Stack penuh tidak bisa menambahkan tugas lagi");
        }
    }
    
    public Mahasiswa07 pop () {
        if (! isEmpty()) {
            Mahasiswa07 m = stack[top];
            top--;
            return m;
        } else{
            System.out.println("Stack kosong, tidak ada tugas untuk di nilai");
            return null;
        }

    }

    public Mahasiswa07 peek (){
        if (! isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong, tidak ada tugas yang di kumpulkan ");
            return null;
        }
    }

    public void print (){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama+ "\t" + stack[i].nim + "\t" + stack[i].kelas);
            
        }
        System.out.println(" ");
        
    }
    public Mahasiswa07 lihatTugasTerbawah() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        return null;
    }
}
public int jumlahTugas() {
    return top + 1;
}

public String konversiDesimalKeBiner(int nilai){
    StackKonversi stack = new StackKonversi();
    while (nilai > 0) {
        int sisa = nilai %2;
        stack.push(sisa);
        nilai=nilai/2;
        
    }
    String biner = new String();
    while (!stack.isEmpty()) {
        biner += stack.pop(); 
    }
    return biner;
} 
    
}
