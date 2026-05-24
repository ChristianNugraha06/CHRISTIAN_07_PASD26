|  | LINKED LIST  |
|--|--|
| NIM |  254107020089|
| Nama |  Christian Nugraha Widyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/ChristianNugraha06/CHRISTIAN_07_PASD26/edit/main/Pertemuan12/REPORT.MD) |


# Hasil percobaan 1

``` Isi Linked List:
Dirga           21212203        4D    3,6

Isi Linked List:
Dirga           21212203        4D    3,6
Alvaro          24212200        1A    4,0

Isi Linked List:
Dirga           21212203        4D    3,6
Bimon           23212201        2B    3,8
Cintia          22212202        3C    3,5
Alvaro          24212200        1A    4,0 ```


# Pertanyaan

1.  Baris pertama menghasilkan "Linked List Kosong" karena sll.print() dipanggil sebelum data apapun ditambahkan, sehingga head == null dan kondisi isEmpty() bernilai true.
2. Variabel temp berperan sebagai pointer sementara untuk melakukan traversal (penelusuran) linked list tanpa mengubah posisi head atau tail. Ini penting agar struktur linked list tetap utuh.
3. ``` static Scanner sc = new Scanner(System.in);
 
    
    static Mahasiswa00 inputMahasiswa() {
        System.out.print("  Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("  Masukkan Nama  : ");
        String nama = sc.nextLine();
        System.out.print("  Masukkan Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("  Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // clear buffer newline
        return new mahasiswa07(nim, nama, kelas, ipk);
    }
 
    public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
 
        System.out.println("========================================");
        System.out.println("  INPUT DATA MAHASISWA DARI KEYBOARD");
        System.out.println("========================================");
 
        // Cetak kondisi awal (kosong)
        sll.print();
 
       
        System.out.println("\n[addFirst] Masukkan data mahasiswa ke-1:");
        mahasiswa07 mhs1 = inputmahasiswa();
        sll.addFirst(mhs1);
        sll.print();
 
        
        System.out.println("\n[addLast] Masukkan data mahasiswa ke-2:");
        mahasiswa07 mhs2 = inputmahasiswa();
        sll.addLast(mhs2);
        sll.print();
 
    
        System.out.print("\n[insertAfter] Masukkan nama mahasiswa yang dijadikan acuan: ");
        String key = sc.nextLine();
        System.out.println("[insertAfter] Masukkan data mahasiswa baru:");
        mahasiswa07 mhs3 = inputmahasiswa();
        sll.insertAfter(key, mhs3);
        sll.print();
 
      
        System.out.print("\n[insertAt] Masukkan indeks tempat mahasiswa akan disisipkan: ");
        int index = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.println("[insertAt] Masukkan data mahasiswa baru:");
        mahasiswa07 mhs4 = inputmahasiswa();
        sll.insertAt(index, mhs4);
        sll.print(); ```


# Hasil percobaan 2

``` data index 1 : Cintia          22212202        3C    3,5
data mahasiswa an Bimon berada pada index : 2

Isi Linked List:
Cintia          22212202        3C    3,5
Bimon           23212201        2B    3,8

Isi Linked List:
Bimon           23212201        2B    3,8 ```

# Pertanyaan 

1. Keyword break digunakan agar loop berhenti setelah node yang dicari ditemukan dan dihapus, supaya tidak terus melanjutkan traversal yang tidak perlu.

2. memutus koneksi ke node yang dihapus. Kemudian if (temp.next == null) tail = temp memperbarui tail jika node yang dihapus adalah node terakhir.

# Latihan 

 
