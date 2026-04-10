package Minggu7;

import java.util.Scanner;

public class MainPeminjaman07 {

    static Mahasiswa07[] listMhs;
    static Buku07[] listBuku;
    static Peminjaman07[] listPinjam;

    static void tampilMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa07 m : listMhs) {
            m.tampilMahasiswa();
        }
    }

    static void tampilBuku() {
        System.out.println("Daftar Buku:");
        for (Buku07 b : listBuku) {
            b.tampilBuku();
        }
    }

    
    static void tampilPeminjaman() {
        System.out.println("Data Peminjaman:");
        for (Peminjaman07 p : listPinjam) {
            p.tampilPeminjaman();
        }
    }

    
    static void insertionSortDenda() {
        for (int i = 1; i < listPinjam.length; i++) {
            Peminjaman07 temp = listPinjam[i];
            int j = i;
            while (j > 0 && listPinjam[j - 1].denda < temp.denda) {
                listPinjam[j] = listPinjam[j - 1];
                j--;
            }
            listPinjam[j] = temp;
        }
    }

   
        static void sortByNIM() {
    for (int i = 1; i < listPinjam.length; i++) {
        Peminjaman07 temp = listPinjam[i];
        int j = i;
        while (j > 0 && Integer.parseInt(listPinjam[j - 1].mhs.nim) > 
                         Integer.parseInt(temp.mhs.nim)) {
            listPinjam[j] = listPinjam[j - 1];
            j--;
        }
        listPinjam[j] = temp;
    }

    }

   static void binarySearchNIM(String nim) {
    sortByNIM();

    int left = 0;
    int right = listPinjam.length - 1;
    boolean ditemukan = false;

    System.out.println("Hasil pencarian NIM: " + nim);

    while (left <= right) {
        int mid = (left + right) / 2;
        int nimMid = Integer.parseInt(listPinjam[mid].mhs.nim);
        int nimCari = Integer.parseInt(nim);

        if (nimMid == nimCari) {
            
            int i = mid;
            while (i >= 0 && Integer.parseInt(listPinjam[i].mhs.nim) == nimCari) {
                i--;
            }
            i++;
            while (i < listPinjam.length && Integer.parseInt(listPinjam[i].mhs.nim) == nimCari) {
                listPinjam[i].tampilPeminjaman();
                i++;
                ditemukan = true;
            }
            break;
        } else if (nimMid < nimCari) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    if (!ditemukan) {
        System.out.println("Data dengan NIM " + nim + " tidak ditemukan.");
    }
}
    
    
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        
        listMhs = new Mahasiswa07[]{
            new Mahasiswa07("22001", "Andi",  "Teknik Informatika"),
            new Mahasiswa07("22002", "Budi",  "Teknik Informatika"),
            new Mahasiswa07("22003", "Citra", "Sistem Informasi Bisnis")
        };

       
        listBuku = new Buku07[]{
            new Buku07("B001", "Algoritma",   2020),
            new Buku07("B002", "Basis Data",  2019),
            new Buku07("B003", "Pemrograman", 2021),
            new Buku07("B004", "Fisika",      2024)
        };

        
        listPinjam = new Peminjaman07[]{
            new Peminjaman07(listMhs[0], listBuku[0], 7),
            new Peminjaman07(listMhs[1], listBuku[1], 3),
            new Peminjaman07(listMhs[2], listBuku[2], 10),
            new Peminjaman07(listMhs[2], listBuku[3], 6),
            new Peminjaman07(listMhs[0], listBuku[1], 4)
        };

        int pilih = -1;
        while (pilih != 0) {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(Christ.nextLine());

            System.out.println();
            switch (pilih) {
                case 1:
                    tampilMahasiswa();
                    break;
                case 2:
                    tampilBuku();
                    break;
                case 3:
                    tampilPeminjaman();
                    break;
                case 4:
                    insertionSortDenda();
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nimCari = Christ.nextLine();
                    binarySearchNIM(nimCari);
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        
    }
}