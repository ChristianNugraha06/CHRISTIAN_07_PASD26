package Minggu2;

public class DosenMain07 {
    public static void main(String[] args) {
        Dosen07 Dos1=new Dosen07();
        Dos1.idDosen = " CHR ";
        Dos1.nama = " Christ ";
        Dos1.statusAktif = true;
        Dos1.tahunBergabung = 20045;
        Dos1.bidangKeahlian = " Bhs inggris ";

        Dos1.tampilInformasi();
        Dos1.hitungMasaKerja(2051);
        Dos1.ubahKeahlian("UI");
        Dos1.tampilInformasi();

       Dosen07 Dos2 = new Dosen07("OKT", "OKTA", true, "SISOP", 2046);

        Dos2.tampilInformasi();
        Dos2.hitungMasaKerja(2051);
        Dos2.ubahKeahlian("ASD");
        Dos2.tampilInformasi();
    }
}
