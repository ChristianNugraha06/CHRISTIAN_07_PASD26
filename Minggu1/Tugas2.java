package Minggu1;

import java.util.Scanner;

public class Tugas2 {
     static Scanner scanner = new Scanner(System.in);

    static String[][] inputJadwal(int n) {
        String[][] jadwal = new String[n][4];
        System.out.println("\n--- Input Jadwal Kuliah ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1) + ":");
            System.out.print("  Nama Mata Kuliah : ");
            jadwal[i][0] = scanner.nextLine();
            System.out.print("  Ruang            : ");
            jadwal[i][1] = scanner.nextLine();
            System.out.print("  Hari Kuliah      : ");
            jadwal[i][2] = scanner.nextLine();
            System.out.print("  Jam Kuliah       : ");
            jadwal[i][3] = scanner.nextLine();
        }
        return jadwal;
    }

    static void tampilkanSemua(String[][] jadwal) {
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        System.out.println("======================================================================================");
        System.out.printf("%-5s %-25s %-20s %-12s %-15s%n", "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("======================================================================================");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-5d %-25s %-20s %-12s %-15s%n",
                (i + 1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("======================================================================================");
    }

    static void cariByHari(String[][] jadwal, String hari) {
        System.out.println("\n--- Jadwal Kuliah Hari: " + hari + " ---");
        System.out.println("======================================================================================");
        System.out.printf("%-5s %-25s %-20s %-12s %-15s%n", "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("======================================================================================");
        boolean ditemukan = false;
        int no = 1;
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-5d %-25s %-20s %-12s %-15s%n",
                    no++, jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari " + hari + ".");
        }
        System.out.println("======================================================================================");
    }

    static void cariByMataKuliah(String[][] jadwal, String mataKuliah) {
        System.out.println("\n--- Jadwal Mata Kuliah: " + mataKuliah + " ---");
        System.out.println("======================================================================================");
        System.out.printf("%-5s %-25s %-20s %-12s %-15s%n", "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("======================================================================================");
        boolean ditemukan = false;
        int no = 1;
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mataKuliah)) {
                System.out.printf("%-5d %-25s %-20s %-12s %-15s%n",
                    no++, jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah \"" + mataKuliah + "\" tidak ditemukan.");
        }
        System.out.println("======================================================================================");
    }

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("       Program Manajemen Jadwal Kuliah           ");
        System.out.println("================================================");

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[][] jadwal = inputJadwal(n);

        int pilihan = 0;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tampilkan seluruh jadwal");
            System.out.println("2. Cari jadwal berdasarkan hari");
            System.out.println("3. Cari jadwal berdasarkan mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanSemua(jadwal);
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hari = scanner.nextLine();
                    cariByHari(jadwal, hari);
                    break;
                case 3:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String mk = scanner.nextLine();
                    cariByMataKuliah(jadwal, mk);
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}

