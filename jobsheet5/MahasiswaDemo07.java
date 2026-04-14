package jobsheet5;

import java.util.Scanner;

public class MahasiswaDemo07 {
    
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
       
        for (int i = 1; i <= 5; i++) {
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

        
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
        
        System.out.println("Data yang sudah terurut menggunakan selection Sort (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION Sort (ASC) : ");
        list.insertionSort();
        list.tampil();
        


    }
}


