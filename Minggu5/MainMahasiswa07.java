package Minggu5;

public class MainMahasiswa07 {
    
    public static void main(String[] args) {
        Mahasiswa07 mhs =  new Mahasiswa07();
        int n = mhs.nilaiUTS.length;

        System.out.println("a) Nilai UTS tertinggi (DC): " 
            + mhs.maxUTS(mhs.nilaiUTS, 0, n-1));  

        System.out.println("b) Nilai UTS terendah (DC): "  
            + mhs.minUTS(mhs.nilaiUTS, 0, n-1));  
        System.out.println("c) Rata-rata UAS (BF): "       
            + mhs.rataUAS());                    
    }
    
}
