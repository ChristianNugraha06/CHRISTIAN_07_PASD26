package Minggu1;

public class Percobaan2 {
    
    public static void main(String[] args) {
        int nim = 2541078;

        int sisa;
        sisa = nim%100;

        if (sisa<10) {
            sisa+=10;
        }

        for(int i=1;i<sisa;i++){
            if (i==10||i==15) 
                continue;
            if (i%3==0)
                System.out.print("#");
            if (i%2!=0)
                System.out.print("*");
            else{
                if (i%3!=0) {
                    System.out.print(i);
                }
            }
                
            
        }
        }
    }

