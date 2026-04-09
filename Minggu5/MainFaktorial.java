package Minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner Christ = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = Christ.nextInt();

         faktorial07 fk = new faktorial07();
         System.out.println("Nilai faktorial : " +nilai+ " menggunakan BF : " +fk.faktorialIBF(nilai));
         System.out.println("Nilai faktorial " +nilai + " menggunakan DC : "+  fk.faktorialIDC(nilai));
         

    }
   
    
}
