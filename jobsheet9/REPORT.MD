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



