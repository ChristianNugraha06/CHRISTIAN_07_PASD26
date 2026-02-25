package Minggu2;

public class MatakuliahMain07 {
    
    public static void main(String[] args) {
        Matakuliah07 MK1 = new Matakuliah07();
        MK1.kodeMK = "PASD";
        MK1.nama = "Praktik algoritma struktur data";
        MK1.SKS = 2;
        MK1.jumlahJam = 4;

        MK1.tampilkanInformasi();
        MK1.tambahJam(2);
        MK1.tampilkanInformasi();
        MK1.kurangiJam(1);
        MK1.ubahSKS(4);
        MK1.tampilkanInformasi();

        Matakuliah07 MK2 = new Matakuliah07("ASD", "Algoritma Strujtur data", 2, 4);
        MK2.kurangiJam(2);
        MK2.ubahSKS(4);
        MK2.tampilkanInformasi();

    }
}
