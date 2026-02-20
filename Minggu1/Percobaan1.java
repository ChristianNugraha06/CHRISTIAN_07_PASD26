package Minggu1;

import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner (System.in);
        String Nhuruf="";
        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");

        System.out.println("========================================");

        System.out.print("Masukkan nilai tugas: ");
        int Ntugas = Christ.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int Nkuis = Christ.nextInt();
        System.out.print("Masukan nilai UTS: ");
        int NUTS = Christ.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int NUAS = Christ.nextInt(); 

        if (Ntugas <0 || Nkuis <0 || NUTS <0 || NUAS <0 || Ntugas >100 || Nkuis > 100 || NUTS >100 || NUAS >100) {
            System.out.println("========================================");
            System.out.println("Nilai tidak valid");  
        }else {
            System.out.println("========================================");
            System.out.println("Nilai valid");
        }

        double Ntotal = 0.2* Ntugas + 0.2*Nkuis + 0.3*NUTS + 0.4*NUAS;
        

        
        if (Ntotal>80 && Ntotal<=100) {
            Nhuruf = "A";
        }else if (Ntotal>73 && Ntotal<=80) {
            Nhuruf = "B+";
        }else if (Ntotal>65 && Ntotal<=73) {
            Nhuruf = "B";
        }else if (Ntotal>60 && Ntotal<=65) {
            Nhuruf = "C+";
        }else if (Ntotal>50 && Ntotal<=60) {
            Nhuruf = "C";
        }else if (Ntotal>39 && Ntotal<=50) {
            Nhuruf = "D";
        }else if (Ntotal<=39) {
            Nhuruf = "E";
        }
        System.out.println("========================================");
        System.out.println("========================================");
        System.out.println("Nilai Angka: " +Ntotal);
        System.out.println("========================================");
        System.out.println("huruf: " + Nhuruf);
       
    
            

        

       

    }
}
