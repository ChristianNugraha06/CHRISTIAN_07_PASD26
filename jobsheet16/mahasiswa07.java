package jobsheet16;

public class mahasiswa07 {
    
    String nim;
    String nama;
    String notelp;

    public mahasiswa07() {
    }

    public mahasiswa07(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
