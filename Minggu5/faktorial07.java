package Minggu5;

public class faktorial07 {
    int faktorialIBF;
    int faktorialIDC;

     int faktorialIBF(int n) {
        int fakto =1;
        int i =1;
        
        while (i<=1) {
            fakto = fakto*i;
            i++;
        }
        return fakto;
    } 
    
        int faktorialIDC(int n) {
            if (n==1) {
                return 1;
            }else{
                int fakto = n * faktorialIDC(n-1);
                return fakto;
            }
        }
        
}

