package Minggu5;

import java.util.Scanner;

public class MainSum07 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen : ");
        int elemen =Christ.nextInt();

        Sum07 sm = new Sum07(elemen);

        for (int i = 0; i <elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+ ": " ); 
            sm.keuntungan[i] = Christ.nextDouble();     
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Devide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
        

    }
}
