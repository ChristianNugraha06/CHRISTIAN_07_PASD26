package Minggu7;

public class Peminjaman07 {
    
    Mahasiswa07 mhs;
    Buku07 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    // jawaban sesi 4 B
    String isCanceled; 

    
   Peminjaman07(Mahasiswa07 mhs, Buku07 buku, int lamaPinjam){
    this.mhs=mhs;
    this.buku = buku;
    this.lamaPinjam=lamaPinjam;
    hitungDenda ();
   }

   void hitungDenda(){
    if (lamaPinjam>batasPinjam){
        terlambat = lamaPinjam-batasPinjam;
        denda = terlambat*2000;
    }else{
        terlambat =0;
        denda =0;
    }
    // jawaban sesi 4 A
    if (denda > 20000) {
        denda=20000;
    }
   }


  //lanjutan jawaban sesi 4 B 
   void flagging (){

   }
   void tampilPeminjaman(){
   System.out.println(mhs.nama + " | " + buku.judul +
                " | Lama: " + lamaPinjam +
                " | Terlambat: " + terlambat +
                " | Denda: " + denda);
   }

 

   
}
