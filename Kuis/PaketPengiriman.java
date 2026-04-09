package Kuis;
//membuat class paket pengiriman
public class PaketPengiriman {
    String nomoResi;
    double berat;
    double ongkosDasar;

    double tBerat (double beratPaket){
        
        double tBerat = beratPaket + berat;
        return tBerat;
    }

    public double totalOngkos (double ongkosKirim){
        double totalOngkos = ongkosDasar + ongkosKirim;
        return totalOngkos;



    }

    void printData(){
        System.out.println ("Total berat: " +tBerat(berat));
        System.out.println("Total ongkos: " +totalOngkos(berat));
    }

}
