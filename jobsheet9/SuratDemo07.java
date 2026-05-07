package jobsheet9;

import java.util.Scanner;

public class SuratDemo07 {
     public static void main(String[] args) {
        StackSurat07 stack = new StackSurat07(10);
        Scanner scan = new Scanner(System.in);
        int pilih;
 
        do {
            System.out.println("\n=== Menu Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
 
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S=Sakit / I=Izin): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
 
                    Surat07 surat = new Surat07(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    System.out.println("Surat dari " + nama + " berhasil diterima.");
                    break;
 
                case 2:
                    Surat07 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("\n--- Memproses Surat ---");
                        System.out.println("ID Surat   : " + proses.idSurat);
                        System.out.println("Nama       : " + proses.namaMahasiswa);
                        System.out.println("Kelas      : " + proses.kelas);
                        System.out.println("Jenis Izin : " + (proses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi     : " + proses.durasi + " hari");
                        System.out.println("Surat berhasil diverifikasi.");
                    }
                    break;
 
                case 3:
                    Surat07 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("\n--- Surat Izin Terakhir ---");
                        System.out.println("ID Surat   : " + terakhir.idSurat);
                        System.out.println("Nama       : " + terakhir.namaMahasiswa);
                        System.out.println("Kelas      : " + terakhir.kelas);
                        System.out.println("Jenis Izin : " + (terakhir.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi     : " + terakhir.durasi + " hari");
                    }
                    break;
 
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;
 
                case 5:
                    System.out.println("Program selesai.");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid.");
            }
 
        } while (pilih >= 1 && pilih <= 4);
 
        
    }
}
