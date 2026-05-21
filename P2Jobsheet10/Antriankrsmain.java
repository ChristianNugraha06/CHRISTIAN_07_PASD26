package P2Jobsheet10;

import java.util.Scanner;

public class Antriankrsmain {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antriankrs antrian = new Antriankrs(10); 
        int pilihan;
 
        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Panggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan 2 Antrian Terdepan");
            System.out.println("5.  Tampilkan Antrian Paling Akhir");
            System.out.println("6.  Cek Antrian Kosong");
            System.out.println("7.  Cek Antrian Penuh");
            System.out.println("8.  Jumlah Mahasiswa dalam Antrian");
            System.out.println("9.  Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("10. Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0.  Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
 
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
 
                case 2:
                    antrian.panggilDuaMahasiswa();
                    break;
 
                case 3:
                    antrian.tampilkanSemua();
                    break;
 
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
 
                case 5:
                    antrian.LihatAkhir();
                    break;
 
                case 6:
                    if (antrian.IsEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong. Jumlah: " + antrian.getJumlahAntrian());
                    }
                    break;
 
                case 7:
                    if (antrian.IsFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh. Sisa slot: " + (10 - antrian.getJumlahAntrian()));
                    }
                    break;
 
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
 
                case 9:
                    System.out.println("Jumlah mahasiswa sudah proses KRS: " + antrian.getTotalDilayani());
                    break;
 
                case 10:
                    System.out.println("Jumlah mahasiswa belum proses KRS: " + antrian.getBelumKRS());
                    break;
 
                case 11:
                    antrian.kosongkanAntrian();
                    break;
 
                case 0:
                    System.out.println("Terima kasih.");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
 
        } while (pilihan != 0);
 
        
    }
}
