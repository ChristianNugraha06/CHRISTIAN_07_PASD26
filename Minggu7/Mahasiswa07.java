package Minggu7;

public class Mahasiswa07 {

    String nim;
    String nama; 
    String prodi;

    Mahasiswa07(String nim, String nama, String prodi ){

        this.nim=nim;
        this.nama=nama;
        this.prodi=prodi;



    }
      void tampilMahasiswa(){
            System.out.println("Nim: " +nim + " | Nama: " + nama + " | Prodi: " + prodi);
        }
}
