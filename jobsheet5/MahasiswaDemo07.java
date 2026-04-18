package jobsheet5;

import java.util.Scanner;

public class MahasiswaDemo07 {
    
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
        int jumMhs=5;
       
        for (int i = 1; i <= jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + i);
            System.out.print("NIM   : ");
            String nim = Christ.nextLine();
            System.out.print("Nama  : ");
            String nama = Christ.nextLine();
            System.out.print("Kelas : ");
            String kelas = Christ.nextLine();
            System.out.print("IPK   : ");
            double ipk = Christ.nextDouble();
            Christ.nextLine();

            Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(mhs);
            System.out.println("------------------------------");
            
        }
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("------------------------------");
        System.out.println("Pencarian data ");
        System.out.println("------------------------------");
        System.out.println("Masukkan IPK yang dicari: ");
        System.out.print("IPK:");
        double cari = Christ.nextDouble();

            

        System.out.println("Menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        


    }
}


