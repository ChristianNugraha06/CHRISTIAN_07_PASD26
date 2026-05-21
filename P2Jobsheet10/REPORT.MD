|  | QUEUE  |
|--|--|
| NIM |  254107020089|
| Nama |  Christian Nugraha Widyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/ChristianNugraha06/CHRISTIAN_07_PASD26/new/main/P1Jobsheet10) |

# Hasil percobaan 2 

``` === Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
0. Keluar
Pilih menu:1
NIM : 123
Nama : Aldi
Prodi :TI
Kelas : 1A
Aldi Berhasil masuk ke antrian 

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
0. Keluar
Pilih menu:1
NIM : 124
Nama : Bobi
Prodi :TI
Kelas : 1G
Bobi Berhasil masuk ke antrian 

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
0. Keluar
Pilih menu:4
Daftar mahasiswa dalam antrian
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
0. Keluar
Pilih menu:2
Melayani mahasiswa: 123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
0. Keluar
Pilih menu:4
Daftar mahasiswa dalam antrian
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
0. Keluar
Pilih menu:5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
0. Keluar
Pilih menu:0
Terima kasih. ```

# Pertanyaan 

```  public void LihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    } ```

Hasil 
``` === Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
6. Cek antrian paling belakang 
0. Keluar
Pilih menu:1
NIM : 123
Nama : Aldi
Prodi :TI
Kelas : 1A
Aldi Berhasil masuk ke antrian 

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
6. Cek antrian paling belakang 
0. Keluar
Pilih menu:1
NIM : 124
Nama : Bobi
Prodi :TI
Kelas : 1G
Bobi Berhasil masuk ke antrian 

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
6. Cek antrian paling belakang 
0. Keluar
Pilih menu:6
Mahasiswa paling belakang: 
NIM - NAMA - PRODI - KELAS
124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan 
4. Lihat semua antrian
5. Jumlah Mahasiswa dalam antrian
6. Cek antrian paling belakang 
0. Keluar
Pilih menu:0
Terima kasih. ```

