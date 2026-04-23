|  | BRUTE FORCE DAN DIVIDE CONQUER |
|--|--|
| NIM |  254107020089|
| Nama |  Christian Nugraha Widyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/ChristianNugraha06/CHRISTIAN_07_PASD26/new/main/Minggu5) |


#Hasil percobaan 1

``` asukkan nilai : 5
Nilai faktorial : 5 menggunakan BF : 120
Nilai faktorial 5 menggunakan DC : 120 ```

## Pertanyaan Percobaan 1

1.  if (n==1)Base case — titik berhenti rekursi, mengembalikan nilai pasti 
else Recursive case — memecah masalah dengan memanggil dirinya sendiri 

2. Bisa diganti dengan while kodenya akan seperti ini ```  int i =1;
        
        while (i<=1) {
            fakto = fakto*i;
            i++;
        }
        return fakto; ```

dan hasilnya akan seperti ini ``` Masukkan nilai : 5
Nilai faktorial : 5 menggunakan BF : 1
Nilai faktorial 5 menggunakan DC : 120 ```

3. fakto *= i Cara kerjanya Iteratif — mengalikan satu per satu dalam loop, dan tidak menambah call stack
sedangkan int fakto = n * faktorialDC(n-1) Cara kerjanya Rekursif — memanggil method dirinya sendiri dan Setiap panggilan menambah call stack

4. faktorialBF() bekerja secara iteratif — menggunakan loop for dari 1 sampai n, mengalikan satu per satu secara berurutan dari kiri ke kanan.
faktorialDC() bekerja secara rekursif — memecah masalah menjadi submasalah yang lebih kecil (n-1) hingga mencapai base case (n=1), lalu hasilnya digabungkan saat kembali naik ke pemanggil sebelumnya.

#Hasil percobaan 2 
``` Masukkan Jumlah elemen : 3
Masuukan nilai basis elemen ke-1: 2
Masukkan nilai pangkat elemen ke-1: 3
Masuukan nilai basis elemen ke-2: 4
Masukkan nilai pangkat elemen ke-2: 5
Masuukan nilai basis elemen ke-3: 6
Masukkan nilai pangkat elemen ke-3: 7
HASIL PANGKAT BRUTEFORCE
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT DIVIDE AND CONQUER
2^3: 8
4^5: 1024
6^7: 279936 ```

## Pertanyaan percobaan 2

1. pangkatBF() → Menggunakan perulangan for sebanyak n kali, mengalikan hasil dengan a satu per satu. Kompleksitas O(n).
pangkatDC() → Menggunakan rekursif dengan membagi pangkat menjadi setengahnya setiap langkah. 
Jika pangkat ganjil: pangkatDC(a, n/2) * pangkatDC(a, n/2) * a, jika genap: pangkatDC(a, n/2) * pangkatDC(a, n/2). Kompleksitas O(log n), lebih efisien untuk pangkat besar.

2. Ya, sudah ada. Tahap combine pada pangkatDC() terdapat pada baris: 
``` return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
return (pangkatDC(a, n/2) * pangkatDC(a, n/2));      ```
Perkalian hasil dua sub-masalah itulah yang merupakan tahap combine — menggabungkan hasil rekursi kiri dan kanan menjadi hasil akhir.

3. Bisa dibuat tanpa parameter dengan memanfaatkan atribut kelas nilai dan pangkat 
Namun versi berparameter tetap relevan karena lebih fleksibel — bisa menghitung pangkat untuk nilai berbeda tanpa membuat objek baru

4. pangkatBF() menghitung aⁿ dengan mengalikan a sebanyak n kali secara berulang. Sederhana namun membutuhkan n langkah operasi.
pangkatDC() memotong jumlah operasi dengan membagi pangkat menjadi dua bagian (n/2) setiap rekursi. Jauh lebih cepat untuk nilai pangkat besar karena hanya butuh log₂(n) langkah.


#Hasil percobaan 3

``` Masukkan jumlah elemen : 5
Masukkan keuntungan ke-1: 10
Masukkan keuntungan ke-2: 20
Masukkan keuntungan ke-3: 30
Masukkan keuntungan ke-4: 40
Masukkan keuntungan ke-5: 50
Total keuntungan menggunakan Bruteforce: 150.0
Total keuntungan menggunakan Devide and Conquer: 150.0 ```

#Pertanyaan Percobaan 3

1. mid digunakan sebagai titik tengah untuk membagi array menjadi dua bagian (kiri dan kanan). Ini adalah inti dari Divide and Conquer — array dibagi terus hingga tersisa 1 elemen, lalu hasilnya digabungkan.

2. lsum → Menyimpan hasil penjumlahan bagian kiri array (indeks l sampai mid)
rsum → Menyimpan hasil penjumlahan bagian kanan array (indeks mid+1 sampai r)

3. Ini adalah tahap Combine — menggabungkan hasil dari dua sub-array (kiri dan kanan) menjadi total keseluruhan. 
Tanpa ini, hasil rekursi sub-masalah tidak akan tergabung menjadi jawaban akhir.

4. Base case-nya adalah ketika indeks kiri sama dengan indeks kanan (l == r), artinya array hanya memiliki 1 elemen, sehingga langsung dikembalikan nilai elemen tersebut.

5. Divide — membagi array menjadi dua bagian menggunakan mid = (l+r)/2
Conquer — menjumlahkan masing-masing bagian secara rekursif hingga mencapai 1 elemen
Combine — menggabungkan hasil kiri (lsum) dan kanan (rsum) dengan penjumlahan, lalu dikembalikan ke pemanggil di atasnya

# Hasil Latihan 
``` a) Nilai UTS tertinggi (DC): 92
b) Nilai UTS terendah (DC): 76
c) Rata-rata UAS (BF): 85.375 ```






