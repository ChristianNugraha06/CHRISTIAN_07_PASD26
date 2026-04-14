package jobsheet5;

import java.util.Scanner;

public class Dosenmain07 {
    
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);
        DataDosen07 data = new DataDosen07();
        int pilihan;
 
        do {
            System.out.println("\n======== MENU DATA DOSEN ========");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC  (Bubble Sort    - Termuda ke Tertua)");
            System.out.println("4. Sorting DSC  (Selection Sort - Tertua ke Termuda)");
            System.out.println("5. Sorting ASC  (Insertion Sort - Termuda ke Tertua)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Christ.nextInt();
            Christ.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen              : ");
                    String kode = Christ.nextLine();
                    System.out.print("Masukkan Nama Dosen              : ");
                    String nama = Christ.nextLine();
                    System.out.print("Jenis Kelamin (1=Laki-laki / 0=Perempuan) : ");
                    boolean jk = Christ.nextInt() == 1;
                    System.out.print("Masukkan Usia Dosen              : ");
                    int usia = Christ.nextInt();
                    Christ.nextLine();
                    Dosen07 dsn = new Dosen07(kode, nama, jk, usia);
                    data.tambah(dsn);
                    System.out.println("Data berhasil ditambahkan!");
                    break;
 
                case 2:
                    if (data.idx == 0) {
                        System.out.println("Belum ada data dosen.");
                    } else {
                        System.out.println("\n===== DATA SELURUH DOSEN =====");
                        data.tampil();
                    }
                    break;
 
                case 3:
                    if (data.idx == 0) {
                        System.out.println("Belum ada data dosen.");
                    } else {
                        data.SortingASC();
                        System.out.println("\n=== Data Dosen Terurut ASC - Bubble Sort (Termuda ke Tertua) ===");
                        data.tampil();
                    }
                    break;
 
                case 4:
                    if (data.idx == 0) {
                        System.out.println("Belum ada data dosen.");
                    } else {
                        data.sortingDSC();
                        System.out.println("\n=== Data Dosen Terurut DSC - Selection Sort (Tertua ke Termuda) ===");
                        data.tampil();
                    }
                    break;
 
                case 5:
                    if (data.idx == 0) {
                        System.out.println("Belum ada data dosen.");
                    } else {
                        data.insertionSort();
                        System.out.println("\n=== Data Dosen Terurut ASC - Insertion Sort (Termuda ke Tertua) ===");
                        data.tampil();
                    }
                    break;
 
                case 0:
                    System.out.println("Program selesai. Sampai jumpa!");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka 0-5.");
            }
        } while (pilihan != 0);
 
       
    }
}
