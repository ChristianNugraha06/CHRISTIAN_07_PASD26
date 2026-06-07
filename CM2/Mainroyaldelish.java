package CM2;

import java.util.Scanner;

public class Mainroyaldelish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antriandll antrian = new Antriandll();
        Pesanandll pesananList = new Pesanandll();
 
       
        int pilihan;
 
        do {
            System.out.println("\n==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();
 
            switch (pilihan) {
 
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    antrian.tambahAntrian(new Pembeli(nama, noHp));
                    break;
 
                case 2:
                    
                    antrian.cetakAntrian();
                    break;
 
                case 3:
                    
                    antrian.cetakAntrian();
                    if (!antrian.isEmpty()) {
                        System.out.print("\nMasukkan No Antrian yang dipanggil : ");
                        int noAntrian = sc.nextInt();
                        sc.nextLine();
 
                        Pembeli pembeliDipanggil = antrian.hapusAntrian(noAntrian);
 
                        if (pembeliDipanggil != null) {
                            System.out.print("Kode Pesanan  : ");
                            int kode = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Nama Pesanan  : ");
                            String namaPesanan = sc.nextLine();
                            System.out.print("Harga         : ");
                            int harga = sc.nextInt();
                            sc.nextLine();
 
                            pesananList.tambahPesanan(new Pesanan(kode, namaPesanan, harga));
                            System.out.println(pembeliDipanggil.namaPembeli
                                    + " telah memesan " + namaPesanan);
                        }
                    }
                    break;
 
                case 4:
                   
                    pesananList.laporanPesanan();
                    break;
 
                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
 
                default:
                    System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
 
        } while (pilihan != 0);
 
        
    } 
}
