package Minggu2;

public class Mahasiswa07 {
    String nama;
    String kelas;
    String NIM; 
    double IPK; 

    void tampilkanInformasi() {
        System.out.print("Nama: " + nama);
        System.out.print("NIM: " + NIM);
        System.out.print("IPK: " + IPK);
        System.out.print("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkbaru){
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
   
        
    

}
