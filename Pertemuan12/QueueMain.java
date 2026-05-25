package Pertemuan12;

import java.util.Scanner;

public class QueueMain {
    static Scanner sc = new Scanner(System.in);
    static QueueMahasiswa antrian = new QueueMahasiswa();

     static void tampilMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("  MENU ANTRIAN LAYANAN KEMAHASISWAAN");
        System.out.println("-----------------------------------------");
        System.out.println("  1. Daftar Antrian (Tambah Antrian)");
        System.out.println("  2. Panggil Antrian (Dequeue)");
        System.out.println("  3. Tampilkan Semua Antrian");
        System.out.println("  4. Tampilkan Antrian Terdepan");
        System.out.println("  5. Tampilkan Antrian Paling Akhir");
        System.out.println("  6. Tampilkan Jumlah Antrian");
        System.out.println("  7. Cek Antrian Kosong");
        System.out.println("  8. Cek Antrian Penuh");
        System.out.println("  9. Kosongkan Antrian");
        System.out.println("  0. Keluar");
        System.out.println("-----------------------------------------");
    }
    static void daftarAntrian() {
        System.out.println("=== Pendaftaran Antrian ===");
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();
 
       
        mahasiswa07 mhs = new mahasiswa07(nim, nama, kelas, ipk);
        antrian.enQueue(mhs);
    }

     static void cekKosong() {
        if (antrian.isEmpty()) {
            System.out.println("Status: Antrian KOSONG.");
        } else {
            System.out.println("Status: Antrian TIDAK kosong.");
        }
    }
 
    static void cekPenuh() {
        if (antrian.isFull()) {
            System.out.println("Status: Antrian PENUH.");
        } else {
            System.out.println("Status: Antrian BELUM penuh.");
        }
    }



    public static void main(String[] args) {
        int pilihan;

        System.out.println("=========================================");
        System.out.println("  SISTEM ANTRIAN UNIT KEMAHASISWAAN");
        System.out.println("=========================================");
 
        do {
            tampilMenu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

        switch (pilihan) {
            case 1:
                daftarAntrian();
                break;
            case 2:
                antrian.dequeue();
                break;
            case 3:
                antrian.tampilAntrian();
                break;
            case 4:
                antrian.tampilTerdepan();
                break;

            case 5: 
                antrian.tampilTerakhir();
                break;

            case 6:
                antrian.tampilJumlah();
                break;

            case 7:
                cekKosong();
                break;

            case 8:
                cekPenuh();
                break;

            case 9:
                antrian.clearQueue();
                break;
            case 0 :
                System.out.println("Terima kasih. program selesai");
                break;
        
            default:
                System.out.println("Pilihan tidak valid!:");
                break;

        }
        System.out.println();
        } while (pilihan !=0); 
            
        
    }
}
