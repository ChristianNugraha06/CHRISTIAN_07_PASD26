package Minggu1;

import java.util.Scanner;

public class Percobaan4 {
     static int[] harga = {75000, 50000, 60000, 10000};
    
    static int hitungPendapatan(int[] stokCabang) {
        int total = 0;
        for (int i = 0; i < stokCabang.length; i++) {
            total += stokCabang[i] * harga[i];
        }
        return total;
    }

    static String tentukanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        Scanner Christ = new Scanner(System.in);
        int [][] stok = new int [4] [4];


        for (int i = 0; i < namaCabang.length; i++) {
            System.out.println("\nCabang " + namaCabang[i] + ":");
            for (int j = 0; j < namaBunga.length; j++) {
                System.out.print("  Jumlah terjual " + namaBunga[j] + ": ");
                stok[i][j] = Christ.nextInt();
            }
        }
         
       

       

        System.out.println("================================================");
        System.out.println("         Laporan Pendapatan RoyalGarden          ");
        System.out.println("================================================");
        System.out.printf("%-15s %-15s %-15s%n", "Cabang", "Pendapatan", "Status");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < namaCabang.length; i++) {
            int pendapatan = hitungPendapatan(stok[i]);
            String status = tentukanStatus(pendapatan);
            System.out.printf("%-15s Rp%-13s %-15s%n",
                namaCabang[i],
                String.format("%,d", pendapatan),
                status);
        }

        System.out.println("================================================");
    }
}
