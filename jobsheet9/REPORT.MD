|  STACK |
|--|--|
| NIM |  254107020089|
| Nama |  Christian Nugraha Widyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/ChristianNugraha06/CHRISTIAN_07_PASD26/new/main/jobsheet9)|

#Hasil percobaan 1

```  menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat tugas teratas
4. Melihat daftar Tugas
Pilih :1
Nama:Dila
NIM: 1001
Kelas: 1A
Tugas Dila berhasil dikumpulkan 

 menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat tugas teratas
4. Melihat daftar Tugas
Pilih :1
Nama:Erik
NIM: 1002
Kelas: 1B
Tugas Erik berhasil dikumpulkan 

 menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat tugas teratas
4. Melihat daftar Tugas
Pilih :3
Tugas terakhir dikumpulkan oleh: Erik

 menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat tugas teratas
4. Melihat daftar Tugas
Pilih :1
Nama:Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan 

 menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat tugas teratas
4. Melihat daftar Tugas
Pilih :4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
Tika    1003    1C
 

 menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat tugas teratas
4. Melihat daftar Tugas
Pilih :2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai tugas Tika adalah 87

 menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat tugas teratas
4. Melihat daftar Tugas
Pilih :4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B ```

## Pertanyaan Percobaan 1
1. ```  public void print (){
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama+ "\t" + stack[i].nim + "\t" + stack[i].kelas);
            
        }
        System.out.println(" ");
        
    } ``` 

2. 5 Tugas ``` StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
        Scanner Scan = new Scanner(System.in);
            int Pilih; ```

3. Pengecekan is full diperlukan agar penambahan data tidak melebihi kapasitas Stack. 
Jika kondisi tersebut dihapus, maka saat Stack penuh program tetap mencoba menambahkan data baru sehingga dapat menyebabkan error

4. Pada StackTugasmahasiswa07 ``` public Mahasiswa07 lihatTugasTerbawah() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        return null;
    }
} ```

sedangkan pada mahasiswademo terdapat perubahan ``` case 5 :
                    Mahasiswa07 bawah = stack.lihatTugasTerbawah();
                    if (bawah != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                break;
                ```

5. ``` public int jumlahTugas() {
    return top + 1;
} ```
dan ``` case 6 :
                    System.out.println("Jumlah tugas yang sudah terkumpul: " + stack.jumlahTugas());
                    break; ```

# Hasil percobaan 2
``` menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat tugas teratas
4. Melihat daftar Tugas
Pilih :2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai tugas Tika adalah 87
Nilai Biner Tugas: 1010111
```

## Pertanyaan Percobaan 2

1. Method ini bekerja dalam 2 tahap menggunakan Stack:
Tahap 1 (Push) — nilai desimal dibagi 2 berulang, sisa baginya (0 atau 1) di-push ke stack sampai nilai habis (= 0)
Tahap 2 (Pop) — sisa bagi dikeluarkan satu per satu dari stack dan disambung jadi String biner

2. Hasilnya sama saja karena nilai > 0 dan nilai != 0 menghasilkan kondisi yang identik untuk bilangan positif. 
Keduanya berhenti saat nilai mencapai 0. Perbedaannya hanya jika nilai negatif dimasukkan — nilai > 0 langsung berhenti, 
sedangkan nilai != 0 akan infinite loop karena bilangan negatif tidak pernah mencapai 0 saat dibagi 2.

#Hasil tugas praktikum 
``` === Menu Surat Izin ===
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 1
ID Surat       : S001
Nama Mahasiswa : Alif
Kelas          : 1D
Jenis Izin (S=Sakit / I=Izin): S
Durasi (hari)  : 2
Surat dari Alif berhasil diterima.

=== Menu Surat Izin ===
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 2

--- Memproses Surat ---
ID Surat   : S001
Nama       : Alif
Kelas      : 1D
Jenis Izin : Sakit
Durasi     : 2 hari
Surat berhasil diverifikasi.

=== Menu Surat Izin ===
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 3
Stack kosong! Tidak ada surat.

=== Menu Surat Izin ===
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 1
ID Surat       : S003
Nama Mahasiswa : Cika
Kelas          : 1E
Jenis Izin (S=Sakit / I=Izin): I
Durasi (hari)  : 2
Surat dari Cika berhasil diterima.

=== Menu Surat Izin ===
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 1
ID Surat       : S004
Nama Mahasiswa : Dika
Kelas          : 1B
Jenis Izin (S=Sakit / I=Izin): S
Durasi (hari)  : 3
Surat dari Dika berhasil diterima.

=== Menu Surat Izin ===
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 3

--- Surat Izin Terakhir ---
ID Surat   : S004
Nama       : Dika
Kelas      : 1B
Jenis Izin : Sakit
Durasi     : 3 hari

=== Menu Surat Izin ===
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 4
Masukkan nama mahasiswa yang dicari: cika
Surat ditemukan!
ID Surat   : S003
Nama       : Cika
Kelas      : 1E
Jenis Izin : Izin
Durasi     : 2 hari

=== Menu Surat Izin ===
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar ```


