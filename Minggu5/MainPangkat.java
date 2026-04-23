package Minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner Christ = new Scanner (System.in);
        System.out.print("Masukkan Jumlah elemen : ");
        int elemen = Christ.nextInt(); 


        Pangkat07[] png = new Pangkat07[elemen];
        for (int i = 0; i <elemen; i++) {
            System.out.print("Masuukan nilai basis elemen ke-"+(i+1)+": ");
            int basis = Christ.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = Christ.nextInt();
            png[i] = new Pangkat07(basis, pangkat);


           
        }

         System.out.println("HASIL PANGKAT BRUTEFORCE");
           for (Pangkat07 p : png) {
                System.out.println(p.nilai+"^"+p.pangkat+": "+ p.pangkatBF(p.nilai, p.pangkat) );
            
           }
            System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
            for (Pangkat07 p : png) {
                System.out.println(p.nilai+"^"+p.pangkat+": "+ p.pangkatDC(p.nilai, p.pangkat) );

                
            }
    }

}
