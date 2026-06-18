|  | TREE  |
|--|--|
| NIM |  254107020089|
| Nama |  Christian Nugraha Widyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/ChristianNugraha06/CHRISTIAN_07_PASD26/new/main/Pertemuan14) |


# Hasil percobaan 1
``` Daftar semua mahasiswa (in order tranversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa 
Cari mahasiswa dengan ipk: 3.54 : Ditemukan
Cari mahasiswa dengan ipk: 3.22 : Tidak Ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal: 
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Tranversal:
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Tranversal: 
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order tranversal) :
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85 ```

# Pertanyaan percobaan 1

1. Karena Di Binary Search Tree (BST), setiap node mengikuti aturan ketat:
Node kiri selalu memiliki nilai lebih kecil dari node induknya
Node kanan selalu memiliki nilai lebih besar dari node induknya
Hal ini membuat, saat mencari data kita tidak perlu memeriksa semua node. Di setiap langkah, kita bisa langsung memutuskan: "pergi ke kiri" atau "pergi ke kanan", 
sehingga setengah cabang tree langsung diabaikan.

2. jika left menunjuk ke node anak kiri, yang berisi data dengan IPK lebih kecil, sedangkan right menunjuk ke node anak kanan, yang berisi data dengan IPK lebih besar

3a. root adalah pintu masuk utama ke seluruh tree. Semua operasi (add, find, delete, traverse) selalu dimulai dari root. Tanpa root, kita tidak tahu dari mana harus memulai penelusuran tree.
3b. Saat konstruktor BinaryTree00() dipanggil, nilai root diset menjadi null, yang berarti tree masih kosong dan belum ada node satupun di dalamnya.

4. Ketika add() dipanggil pada tree kosong:
Node baru (newNode) dibuat dari data mahasiswa yang diberikan
Method isEmpty() dipanggil → mengembalikan true karena root == null
Karena tree kosong, root langsung diset ke newNode

5. kode ini menelusuri tree sambil mengingat parent, lalu menyisipkan node baru di posisi kosong yang pertama ditemukan sesuai aturan BST.

6. 1. Cari node yang akan dihapus dengan menelusuri tree berdasarkan IPK
   2. Karena node punya 2 anak, tidak bisa langsung dihapus begitu saja (akan memutus hubungan ke kedua subtree-nya)
   3. Panggil getSuccessor(current) untuk mencari node pengganti
   4. Gantikan node yang dihapus dengan successor tersebut
   5. Set successor.left = current.left agar subtree kiri dari node yang dihapus tetap terhubung
getSuccessor() mencari node dengan nilai terkecil di subtree kanan dari node yang akan dihapus

# Hasil percobaan 2
``` Inorder Tranversal Mahasiswa: 
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86 ```

# Pertanyaan Percobaan 2
1. dataMahasiswa adalah array yang menyimpan seluruh objek Mahasiswa sebagai node-node tree. 
Posisi dalam array merepresentasikan posisi node dalam tree 
idxLast berfungsi untuk menyimpan indeks dari node terakhir yang valid dalam array. 
Digunakan sebagai batas agar traversal tidak melewati data yang belum diisi (null)

2. Method ini berfungsi untuk mengisi/memasukkan data ke dalam tree array.
Menerima array mahasiswa dan nilai idxLast dari luar (dari main()), lalu menyimpannya ke atribut class. 
Ini memisahkan proses pengisian data dari proses traversal.

3. Method ini menelusuri tree secara In-Order (Kiri → Root → Kanan) secara rekursif. 
Hasilnya adalah data mahasiswa yang ditampilkan terurut dari IPK terkecil ke terbesar, 
karena array disusun mengikuti struktur BST.

4. Left child → 2*2 + 1 = indeks 5
Right child → 2*2 + 2 = indeks 6

5. idxLast = 6 menunjukkan bahwa indeks terakhir node yang valid adalah 6 (ada 7 data mahasiswa, indeks 0–6). 
Ini mencegah traverseInOrder() mengakses indeks 7 dan 8 yang bernilai null, sehingga tidak terjadi NullPointerException.

6. Pola ini menghasilkan rumus left = 2*i+1 dan right = 2*i+2. Dengan rumus ini, 
hubungan parent-child dalam tree bisa direpresentasikan hanya dengan indeks array, 
tanpa perlu pointer/referensi seperti pada linked list.

