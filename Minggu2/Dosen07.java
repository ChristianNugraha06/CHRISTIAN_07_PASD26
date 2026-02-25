package Minggu2;

public class Dosen07 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi(){
         System.out.println("Id Dosen:  " + idDosen);
        System.out.println("Nama MK: " + nama);
        System.out.println("Status aktif: " + statusAktif );
        System.out.println("Keahlian: " + bidangKeahlian);
    }

    public void setStatusAktif(boolean status) {
    this.statusAktif = status;
    if (this.statusAktif) {
        System.out.println("Dosen sekarang berstatus aktif.");
    } else {
        System.out.println("Dosen sekarang berstatus tidak aktif.");
    }
}    
     public int hitungMasaKerja(int thnSkrg) {
    int masaKerja = thnSkrg - this.tahunBergabung;
    return masaKerja;
}

public void ubahKeahlian(String bidang) {
    bidangKeahlian = bidang;
   
}

public Dosen07(){

}
public Dosen07(String iddosen, String nm, boolean stsAtf, String bk){
    idDosen=iddosen;
    nama=nm;
    statusAktif=stsAtf;
    bidangKeahlian=bk;
}

    

}
