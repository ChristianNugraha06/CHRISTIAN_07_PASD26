package CM2;

public class Pesanandll {
    Nodepesanan head;
    Nodepesanan tail;
 
    public Pesanandll() {
        this.head = null;
        this.tail = null;
    }
 
    public boolean isEmpty() {
        return head == null;
    }
 
    
    public void tambahPesanan(Pesanan pesanan) {
        Nodepesanan newNode = new Nodepesanan(pesanan);
 
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
 
    
    private void sortByNama() {
        if (isEmpty() || head == tail) return;
 
        boolean swapped;
        do {
            swapped = false;
            Nodepesanan current = head;
            while (current.next != null) {
               
                if (current.data.namaPesanan.compareToIgnoreCase(
                        current.next.data.namaPesanan) > 0) {
                   
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
 
    
    public void laporanPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }
 
        sortByNama();
 
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-18s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
 
        int total = 0;
        Nodepesanan current = head;
        while (current != null) {
            System.out.printf("%-14d %-18s %-10d%n",
                    current.data.kodePesanan,
                    current.data.namaPesanan,
                    current.data.harga);
            total += current.data.harga;
            current = current.next;
        }
 
        System.out.println("--------------------------------------");
        System.out.printf("%-14s %-18s %-10d%n", "", "TOTAL PENDAPATAN", total);
        System.out.println("======================================");
    }
}
