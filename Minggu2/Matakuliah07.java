package Minggu2;

public class Matakuliah07 {
    String kodeMK;
    String nama;
    int SKS;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("kode MK:  " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("Jumlah SKS: " + SKS );
        System.out.println("Jam MK: " + jumlahJam);
    }
    public void ubahSKS(int sksBaru) {
    SKS = sksBaru;
    }
    public void tambahJam(int jam) {
    this.jumlahJam += jam;
    }
    public void kurangiJam(int jam) {
    if (this.jumlahJam < jam) {
        System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
    } else {
        this.jumlahJam -= jam;
        
    }
}
public Matakuliah07(){

}
public Matakuliah07(String kMK, String nm, int sks, int jj){
    kodeMK= kMK;
    nama=nm;
    SKS=sks;
    jumlahJam=jj;
}
}
