package Pertemuan12;

public class QueueMahasiswa {
    Node07 head;
    Node07 tail;
    int size;
    int MAX_SIZE = 100;
    
    public QueueMahasiswa(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return(head == null);
    }
    public boolean isFull(){
        return(size>= MAX_SIZE);
    }
    public void clearQueue(){
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan");

    }

    public void enQueue(mahasiswa07 mhs){

        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambahkan data");
            return;
        }
        Node07 newNode07 =  new Node07(mhs, null);

        if (isEmpty()) {
            head = newNode07;
            tail = newNode07;
        }else{
            tail.next=newNode07;
            tail = newNode07;
        }
        size++;
        System.out.println("Mahasiswa " +mhs.nama + " berhasil ditambahkan ke antrian ");


    }
     public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat dipanggil.");
            return;
        }
        System.out.println("\n=== Mahasiswa Dipanggil ===");
        head.data.tampilInformasi();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("===========================\n");
    }

     public void tampilTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\n--- Antrian Terdepan ---");
        head.data.tampilInformasi();
        System.out.println("------------------------");
    }

     public void tampilTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\n--- Antrian Paling Akhir ---");
        tail.data.tampilInformasi();
        System.out.println("----------------------------");
    }
 
    public void tampilJumlah() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size + " orang");
    }
 
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\n========== Daftar Antrian ==========");
        Node07 tmp = head;
        int no = 1;
        while (tmp != null) {
            System.out.println("Antrian ke-" + no + ":");
            tmp.data.tampilInformasi();
            tmp = tmp.next;
            no++;
        }
        System.out.println("=====================================");
    }


}
