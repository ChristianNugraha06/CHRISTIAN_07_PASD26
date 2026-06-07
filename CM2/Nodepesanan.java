package CM2;

public class Nodepesanan {
    Pesanan data;
    Nodepesanan prev;
    Nodepesanan next;
 
    public Nodepesanan(Pesanan data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
