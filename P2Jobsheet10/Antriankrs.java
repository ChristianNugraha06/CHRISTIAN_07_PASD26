package P2Jobsheet10;

public class Antriankrs {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani;
    int maxDilayani = 30;
 
    public Antriankrs(int max) {
        this.max           = max;
        this.data          = new Mahasiswa[max];
        this.front         = 0;
        this.rear          = -1;
        this.size          = 0;
        this.totalDilayani = 0;
    }
 
    
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
 
   
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
 
   
    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian.");
    }
 
   
    public void panggilDuaMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dipanggil.");
            return;
        }
        if (totalDilayani >= maxDilayani) {
            System.out.println("DPA sudah menangani " + maxDilayani + " mahasiswa. Kapasitas penuh.");
            return;
        }
 
        System.out.println("Memanggil mahasiswa untuk proses KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
 
        int jumlahDipanggil = Math.min(2, size);
 
        for (int i = 0; i < jumlahDipanggil; i++) {
            if (totalDilayani >= maxDilayani) {
                System.out.println("Kapasitas DPA sudah penuh (" + maxDilayani + " mahasiswa).");
                break;
            }
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalDilayani++;
            System.out.print((i + 1) + ". ");
            mhs.tampilkanData();
        }
    }
 
    
    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
 
    
    public void tampilkanDuaTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan dalam Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
 
    
    public void LihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling belakang dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }
 
   
    public void kosongkanAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian sudah kosong.");
            return;
        }
        front = 0;
        rear  = -1;
        size  = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
 
   
    public int getJumlahAntrian() {
        return size;
    }
 
    public int getTotalDilayani() {
        return totalDilayani;
    }
 
    public int getBelumKRS() {
        return size;
    }
}
