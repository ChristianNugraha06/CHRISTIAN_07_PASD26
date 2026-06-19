|  | Collection   |
|--|--|
| NIM |  254107020089|
| Nama |  Christian Nugraha Widyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/ChristianNugraha06/CHRISTIAN_07_PASD26/new/main/jobsheet16) |


# Hasil Percobaan 1
```Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
Elemen 0: 2 total elemen: 4 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]```

#Pertanyaan 
1. Karena List l = new ArrayList() dibuat tanpa generic type (raw type). Saat tidak ada tipe generik, ArrayList menggunakan tipe Object secara default, 
dan semua class di Java adalah turunan dari Object, sehingga data int, String, dsb. semua bisa masuk.

2. ``` List <Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        //l.add("Cireng"); //ERROR tipe data  integer
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size()-1));```

Hasil : ``` Elemen 0: 1 total elemen: 3 elemen terakhir: 3
Elemen 0: 2 total elemen: 3 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni] ```

3-5. Perubahan kode ```LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size()-1));
        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size()-1));

        System.out.println("Names: " + names.toString());

        names.push("mei-mei");
        System.out.printf("Elemen 0: %s total elemen; %s elemen terakhir: %s\n", names.getFirst(), names.size(), names.getLast());```
        System.out.println("Names: " + names.toString());


Hasil kode ```Elemen 0: 1 total elemen: 3 elemen terakhir: 3
Elemen 0: 2 total elemen: 3 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
Elemen 0: mei-mei total elemen; 6 elemen terakhir: Al-Qarni
Names: [mei-mei, My kid, Akhleema, Shannum, Uwais, Al-Qarni]```

Saat names2 dideklarasikan sebagai LinkedList<String> (bukan List<String>), kita bisa mengakses method khusus LinkedList seperti:
push("Mei-mei") → menambahkan elemen di posisi paling depan (index 0), seperti Stack
getFirst() → mengambil elemen pertama
getLast() → mengambil elemen terakhir.


# Hasil percobaan 2

``` Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian ```


# Pertanyaan
1. push() adalah method khusus Stack yang menambahkan elemen ke bagian atas Stack (top), dan mengembalikan elemen itu sendiri
add() adalah method warisan dari Vector/List yang juga menambah ke akhir list. Hasilnya sama secara posisi di Stack, tapi push() adalah cara idiomatis untuk Stack 

2. Stack fruits akan kosong karena loop while (!fruits.empty()) { fruits.pop(); } di baris 38-40 sudah mengosongkan semua elemen. 
Maka iterator, stream, dan for-loop di bawahnya tidak akan mencetak apapun karena tidak ada elemen.

3. Baris ini menggunakan Iterator untuk menelusuri setiap elemen Stack secara manual. it.hasNext() mengecek apakah masih ada elemen berikutnya, lalu it.next() mengambil elemen tersebut. 
Berbeda dengan for-each, Iterator memberi kontrol lebih, misalnya bisa menghapus elemen saat traversal dengan it.remove().

4. Akan error kompilasi pada baris-baris yang memanggil method khusus Stack seperti fruits.empty() dan fruits.pop(). 
Ini karena List tidak memiliki method tersebut — method itu milik class Stack (dan Vector). List hanya punya isEmpty() dan remove().



# Hasil percobaan 3
``` Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3} ```

# Pertanyaan
1. Menggunakan konsep Varargs (Variable Arguments) — ditandai dengan Mahasiswa... mahasiswa.
2. ```   
    public int binarySearch(String nim) {
        
        List<String> nimList = new ArrayList<>();
        for (mahasiswa07 m : mahasiswas) {
            nimList.add(m.nim);
        }
        Collections.sort(nimList);
        return Collections.binarySearch(nimList, nim);
    } ```

Hasil 
``` Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3} ```

3. ```  public void sortAscending() {
        mahasiswas.sort((a, b) -> a.nim.compareTo(b.nim));
    }

    public void sortDescending() {
        mahasiswas.sort((a, b) -> b.nim.compareTo(a.nim));
    } ```

Hasil 
``` Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3} ```
