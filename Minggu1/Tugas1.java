package Minggu1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner (System.in);
        char [] kode = {'B', 'D', 'F', 'A', 'L', 'N', 'E', 'G', 'H', 'K'};
        char [][] Kota =  {
            {'J','a','k','a','r','t','a',' ',' ',' ',' ',' '},
            {'B','a','n','d','u','n','g',' ',' ',' ',' ',' '},
            {'B','o','g','o','r',' ',' ',' ',' ',' ',' ',' '},
            {'B','a','n','t','e','n',' ',' ',' ',' ',' ',' '},
            {'S','u','r','a','b','a','y','a',' ',' ',' ',' '},
            {'M','a','l','a','n','g',' ',' ',' ',' ',' ',' '},
            {'J','e','m','b','e','r',' ',' ',' ',' ',' ',' '},
            {'P','e','k','a','l','o','n','g','a','n',' ',' '},
            {'S','e','m','a','r','a','n','g',' ',' ',' ',' '},
            {'P','a','t','i',' ',' ',' ',' ',' ',' ',' ',' '}
        };

        System.out.println("=======================================");
        System.out.println("Program Plat Nomor");
        System.out.println("=======================================");
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = Christ.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.print("Kota: ");
                for (int j = 0; j < Kota[i].length; j++) {
                    if (Kota[i][j] != ' ') {
                        System.out.print(Kota[i][j]);
                    }
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }

        System.out.println("================================================");
      

    }
}
