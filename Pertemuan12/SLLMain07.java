package Pertemuan12;

public class SLLMain07 {
     public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
 
       
        mahasiswa07 mhs1 = new mahasiswa07("24212200", "Alvaro", "1A", 4.0);
        mahasiswa07 mhs2 = new mahasiswa07("22212202", "Cintia", "3C", 3.5);
        mahasiswa07 mhs3 = new mahasiswa07("23212201", "Bimon",  "2B", 3.8);
        mahasiswa07 mhs4 = new mahasiswa07("21212203", "Dirga",  "4D", 3.6);

         sll.print();
 
        sll.addFirst(mhs4);
        sll.print();
 
        
        sll.addLast(mhs1);
        sll.print();
 
       
        sll.insertAfter("Dirga", mhs3);
 
        
        sll.insertAt(2, mhs2);
        sll.print();

         System.out.print("data index 1 : ");
        sll.getData(1);
 
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();
 
        sll.removeFirst();
        sll.removeLast();
        sll.print();
 
        sll.removeAt(0);
        sll.print();

     }

}


