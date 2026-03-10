package Minggu3;

import java.util.Scanner;

public class MahasiswaDemo07 {
    
    public static void main(String[] args) {
        Mahasiswa07[] arrayOfMahasiswa = new Mahasiswa07 [3];
        arrayOfMahasiswa[0] = new Mahasiswa07();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "Agnes Titania Kinanti";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa07();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa07();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-1E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa[0].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa[1].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa[2].ipk);
        System.out.println("-----------------------------------------");

        Scanner Christ = new Scanner(System.in);
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa07();

            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("Print NIM : " );
            arrayOfMahasiswa[i].nim = Christ.nextLine();
             System.out.print("Print nama : " );
            arrayOfMahasiswa[i].nama = Christ.nextLine();
             System.out.print("Print kelas : " );
            arrayOfMahasiswa[i].kelas = Christ.nextLine();
             System.out.print("Print IPK : " );
             dummy = Christ.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat (dummy);
            System.out.println("-----------------------------------------");

        }

        for (int i = 0; i < 3; i++) {
        System.out.println("Data Mahasiswa ke-" + (i+1));
        arrayOfMahasiswa[i].cetakInfo();
        }
        
    }
}
