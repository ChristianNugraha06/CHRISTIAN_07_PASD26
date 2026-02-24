package Minggu2;

public class Mahasiswa07 {
    String nama;
    String kelas;
    String NIM; 
    double IPK; 

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("IPK: " + IPK);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkbaru){
        if (IPK<0.0||IPK>4.0) {
            System.out.print("IPK tidak valid. Harus antara 0.0 dan 4.0 "); 
        }else {
            System.out.println(" ");
        }
        IPK = ipkbaru;
    }
    String nilaiKinerja() {
        if (IPK >= 3.5) {
            return "Kinerja Sangat baik";
        }else if (IPK >= 3.0) {
            return "Kinerja baik";
        }else if (IPK >=2.0) {
            return "Kinerja cukup";
        }else {
            return "Kinerja kurang";
        }
            
        

    }
   public Mahasiswa07 (){

   }

   public Mahasiswa07(String nm, String nim, double ipk, String kls){
    nama = nm;
    NIM = nim;
    IPK = ipk;
    kelas = kls;

    

   }
        
    

}
