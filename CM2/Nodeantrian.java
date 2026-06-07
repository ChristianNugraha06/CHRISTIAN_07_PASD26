package CM2;

public class Nodeantrian {
    int noAntrian;
    Pembeli data;
    Nodeantrian prev;
    Nodeantrian next;
 
    public Nodeantrian(int noAntrian, Pembeli data) {
        this.noAntrian = noAntrian;
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
