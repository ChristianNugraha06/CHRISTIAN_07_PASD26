package Pertemuan12;

import java.util.Scanner;

public class SLLMain07 {

    static Scanner sc = new Scanner (System.in);

 static mahasiswa07 inputMahasiswa() {
        System.out.print("  Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("  Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("  Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("  Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new mahasiswa07(nim, nama, kelas, ipk);
    }
     public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
 
       
        System.out.println("========================================");
        System.out.println("  INPUT DATA MAHASISWA DARI KEYBOARD");
        System.out.println("========================================");
 
        
        sll.print();
 
        
        System.out.println(" Masukkan data mahasiswa ke-1:");
        mahasiswa07 mhs1 = inputMahasiswa();
        sll.addFirst(mhs1);
        sll.print();
 
        
        System.out.println(" Masukkan data mahasiswa ke-2:");
        mahasiswa07 mhs2 = inputMahasiswa();
        sll.addLast(mhs2);
        sll.print();
 
        
        System.out.print(" Masukkan nama mahasiswa yang dijadikan acuan: ");
        String key = sc.nextLine();
        System.out.println("[insertAfter] Masukkan data mahasiswa baru:");
        mahasiswa07 mhs3 = inputMahasiswa();
        sll.insertAfter(key, mhs3);
        sll.print();
 
       
        System.out.print(" Masukkan indeks tempat mahasiswa akan disisipkan: ");
        int index = sc.nextInt();
        sc.nextLine(); 
        System.out.println(" Masukkan data mahasiswa baru:");
        mahasiswa07 mhs4 = inputMahasiswa();
        sll.insertAt(index, mhs4);
        sll.print();
 
       
    }

}


