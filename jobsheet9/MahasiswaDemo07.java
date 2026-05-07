package jobsheet9;

import java.util.Scanner;
import java.util.Stack;

public class MahasiswaDemo07 {
    
    public static void main(String[] args) {
        StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
        Scanner Scan = new Scanner(System.in);

        do {
            System.out.println("\n menu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar Tugas");
            System.out.print("Pilih :");

            Scan.nextLine();

            switch (Pilih) {
                case 1 :
                    System.out.print("Nama:");
                    String Nama = Scan.nextLine();
                    System.out.println("NIM: ");
                    String NIM = Scan.nextLine();
                    System.out.println("Kelas: ");
                    String Kelas = Scan.nextLine();

                    Mahasiswa07 mhs = new Mahasiswa07(Nama, NIM, Kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan \n", mhs.nama);
                    
                    break;
            
                case 2 :
                    Mahasiswa07 dinilai = stack.pop();
                    if (dinilai !=null) {

                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = Scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        
                    }
                    break;
                case 3 :
                    Mahasiswa07 lihat = stack.peek();
                    if (lihat!=null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh: " + lihat.nama);

                        
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak falid");
                
            }

        } while (Pilih >= 1 && Pilih<=4) {
            
        }
    }
}
