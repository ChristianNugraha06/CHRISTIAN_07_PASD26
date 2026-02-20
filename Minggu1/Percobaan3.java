package Minggu1;

import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner Christ = new Scanner(System.in);

        String[][] mataKuliah = {
            {"Pancasila", "2"},
            {"Konsep Teknologi Informasi", "2"},
            {"Critical Thinking dan Problem Solving", "2"},
            {"Matematika Dasar", "4"},
            {"Bahasa Inggris", "2"},
            {"Dasar Pemrograman", "4"},
            {"Praktikum Dasar Pemrograman", "2"},
            {"Keselamatan dan Kesehatan Kerja", "2"}
        };

        int jumlahMK = mataKuliah.length;

        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        System.out.println("====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================");


       

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mataKuliah[i][0] + ": ");
            nilaiAngka[i] = Christ.nextDouble();

            while (nilaiAngka[i]<0||nilaiAngka[i]>100) {
                System.out.print("Nilai tidak valid, masukkan ulang nilai " + mataKuliah[i][0] + " : ");
                nilaiAngka[i] = Christ.nextDouble();

            }
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }
        }

        System.out.println("====================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("====================");

        System.out.printf("%-40s %-12s %-12s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        double totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            int sks = Integer.parseInt(mataKuliah[i][1]);
            double bobotNilai = nilaiSetara[i];

            System.out.printf("%-40s %-12.2f %-12s %-10.2f%n",
                mataKuliah[i][0], nilaiAngka[i], nilaiHuruf[i], bobotNilai);

            totalBobot += bobotNilai * sks;
            totalSKS += sks;
        }

        System.out.println("====================");

        double ip = totalBobot / totalSKS;
        System.out.printf("IP : %.2f%n", ip);
        System.out.println("====================");

        
    }
}
