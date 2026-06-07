package CM2;

public class Antriandll {
    Nodeantrian head;
    Nodeantrian tail;
    int counterAntrian;
 
    public Antriandll() {
        this.head = null;
        this.tail = null;
        this.counterAntrian = 0;
    }
 
    public boolean isEmpty() {
        return head == null;
    }
 
   
    public void tambahAntrian(Pembeli pembeli) {
        counterAntrian++;
        Nodeantrian newNode = new Nodeantrian(counterAntrian, pembeli);
 
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
 
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
    }
 
    
    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
 
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %-15s%n", "No Antrian", "Nama", "No HP");
 
        Nodeantrian current = head;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s%n",
                    current.noAntrian,
                    current.data.namaPembeli,
                    current.data.noHp);
            current = current.next;
        }
    }
 
   
    public Pembeli hapusAntrian(int noAntrian) {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
 
        Nodeantrian current = head;
 
       
        while (current != null && current.noAntrian != noAntrian) {
            current = current.next;
        }
 
        if (current == null) {
            System.out.println("Nomor antrian " + noAntrian + " tidak ditemukan.");
            return null;
        }
 
        if (head == tail) {
            head = tail = null;
        }
        
        else if (current == head) {
            head = head.next;
            head.prev = null;
        }
       
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
       
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
 
        return current.data;
    }
}
