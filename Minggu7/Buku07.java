package Minggu7;

public class Buku07 {
    
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku07(String kode, String judul, int tahun) {
        this.kodeBuku=kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }
    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | judul: " + judul + "| Tahun: " + tahunTerbit);
    }
}
