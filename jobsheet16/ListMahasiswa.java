package jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import P2Jobsheet10.Mahasiswa;

public class ListMahasiswa {
    List<mahasiswa07> mahasiswas = new ArrayList<>();

    public void tambah(mahasiswa07... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, mahasiswa07 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    
    public int binarySearch(String nim) {
        
        List<String> nimList = new ArrayList<>();
        for (mahasiswa07 m : mahasiswas) {
            nimList.add(m.nim);
        }
        Collections.sort(nimList);
        return Collections.binarySearch(nimList, nim);
    }

   public void sortAscending() {
        mahasiswas.sort((a, b) -> a.nim.compareTo(b.nim));
    }

    public void sortDescending() {
        mahasiswas.sort((a, b) -> b.nim.compareTo(a.nim));
    }
   

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();

        mahasiswa07 m  = new mahasiswa07("201234", "Noureen", "021xx1");
        mahasiswa07 m1 = new mahasiswa07("201235", "Akhleema", "021xx2");
        mahasiswa07 m2 = new mahasiswa07("201236", "Shannum", "021xx3");

        
        lm.tambah(m, m1, m2);

        
        lm.tampil();

        
        lm.update(lm.linearSearch("201235"), new mahasiswa07("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
