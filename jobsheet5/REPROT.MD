|  | SORTING (BUBBLE, SELECTION, DAN INSERTION SORT) |
|--|--|
| NIM |  254107020089|
| Nama |  Christian Nugraha Widyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/ChristianNugraha06/CHRISTIAN_07_PASD26/edit/main/jobsheet5/REPROT.MD) |

# Pertanyaan percobaan 1

Hasil program (Gabungan) 
``` Masukkan Data Mahasiswa ke-1
NIM   : 111
Nama  : Ayu
Kelas : 2c
IPK   : 3,7
------------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 222 
Nama  : Dika
Kelas : 2c
IPK   : 2,0
------------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 333
Nama  : Ila
Kelas : 2c
IPK   : 3,8
------------------------------
Masukkan Data Mahasiswa ke-4
NIM   : 444
Nama  : Susi
Kelas : 2c
IPK   : 3,1
------------------------------
Masukkan Data Mahasiswa ke-5
NIM   : 555
Nama  : Yayuk
Kelas : 2c
IPK   : 3,4
------------------------------
Data mahasiswa sebelum sorting:
Nama: Ayu
NIM: 111
Kelas: 2c
IPK: 3.7
--------------------------------
Nama: Dika
NIM: 222
Kelas: 2c
IPK: 2.0
--------------------------------
Nama: Ila
NIM: 333
Kelas: 2c
IPK: 3.8
--------------------------------
Nama: Susi
NIM: 444
Kelas: 2c
IPK: 3.1
--------------------------------
Nama: Yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
--------------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: Ila
NIM: 333
Kelas: 2c
IPK: 3.8
--------------------------------
Nama: Ayu
NIM: 111
Kelas: 2c
IPK: 3.7
--------------------------------
Nama: Yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
--------------------------------
Nama: Susi
NIM: 444
Kelas: 2c
IPK: 3.1
--------------------------------
Nama: Dika
NIM: 222
Kelas: 2c
IPK: 2.0
--------------------------------
Data yang sudah terurut menggunakan selection Sort (ASC) :
Nama: Dika
NIM: 222
Kelas: 2c
IPK: 2.0
--------------------------------
Nama: Susi
NIM: 444
Kelas: 2c
IPK: 3.1
--------------------------------
Nama: Yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
--------------------------------
Nama: Ayu
NIM: 111
Kelas: 2c
IPK: 3.7
--------------------------------
Nama: Ila
NIM: 333
Kelas: 2c
IPK: 3.8
--------------------------------
Data yang sudah terurut menggunakan INSERTION Sort (ASC) :
Nama: Dika
NIM: 222
Kelas: 2c
IPK: 2.0
--------------------------------
Nama: Susi
NIM: 444
Kelas: 2c
IPK: 3.1
--------------------------------
Nama: Yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
--------------------------------
Nama: Ayu
NIM: 111
Kelas: 2c
IPK: 3.7
--------------------------------
Nama: Ila
NIM: 333
Kelas: 2c
IPK: 3.8
-------------------------------- ```

1. Kode if (data[j-1] > data[j]) beserta blok swapnya adalah inti dari Bubble Sort — jika elemen kiri lebih besar dari kanan, ketiga baris berikutnya menukar posisi kedua elemen menggunakan variabel temp sebagai penyimpan sementara.
2. ``` int min = i;
for (int j = i+1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
} ```
3. Kondisi while (j >= 0 && data[j] > temp) pada Insertion Sort artinya: selama indeks j masih valid (tidak keluar batas kiri array) dan elemen data[j] lebih besar dari elemen yang sedang disisipkan (temp), maka geser elemen ke kanan.
4. Perintah data[j+1] = data[j] bertujuan menggeser elemen yang lebih besar satu posisi ke kanan, untuk membuat "ruang kosong" bagi elemen temp yang akan disisipkan di posisi yang tepat.

# Pertanyaan percobaan 2
1a. Karena perulangan i merepresentasikan jumlah tahap/putaran Bubble Sort. Jika panjang array adalah n, maka hanya dibutuhkan n-1 tahap untuk mengurutkan seluruh data.
Alasannya: setelah n-1 tahap, elemen terakhir yang tersisa di posisi pertama sudah pasti merupakan nilai terkecil/terbesar, sehingga tidak perlu diproses lagi. Jika syaratnya i < listMhs.length (tanpa -1), maka terjadi 1 putaran sia-sia yang tidak mengubah apapun.
1b. Karena setiap selesai 1 tahap (i), elemen terbesar sudah "menggelembung" ke posisi paling kanan dan sudah terurut, sehingga tidak perlu dibandingkan lagi.
1c.  Perulangan i berlangsung 49 kali (dari i=0 sampai i=48) Jumlah tahap Bubble Sort = 49 tahap dengan rumus: Jumlah tahap = n - 1 = 50 - 1 = 49 tahap
2. ``` Scanner Christ = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
       
        for (int i = 1; i <= 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + i);
            System.out.print("NIM   : ");
            String nim = Christ.nextLine();
            System.out.print("Nama  : ");
            String nama = Christ.nextLine();
            System.out.print("Kelas : ");
            String kelas = Christ.nextLine();
            System.out.print("IPK   : ");
            double ipk = Christ.nextDouble();
            Christ.nextLine();

            Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(mhs);
            System.out.println("------------------------------");
            
        } ```

# Pertanyaan percobaan 3

mencari indeks mahasiswa dengan IPK terkecil dari sisa array yang belum terurut. Setelah indeks minimum ditemukan, mahasiswa di posisi idxMin akan ditukar dengan mahasiswa di posisi i, sehingga data terurut secara ascending berdasarkan IPK


# Pertanyaan percobaan 4

``` void insertionSort (){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa07 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-i].ipk<temp.ipk) {
                listMhs[j]=listMhs [j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    } ```







