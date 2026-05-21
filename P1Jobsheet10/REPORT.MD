|  | QUEUE  |
|--|--|
| NIM |  254107020089|
| Nama |  Christian Nugraha Widyawan |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/ChristianNugraha06/CHRISTIAN_07_PASD26/new/main/P1Jobsheet10) |

# Hasil percobaan 1 
``` Masukkan kapasitas queue: 4
Masukkan operasi yang di inginkan
1. Enqueue
2. Dequeue
3. Print
4. peek
5. Clear
----------------
1
Masukkan data baru:15
Masukkan operasi yang di inginkan
1. Enqueue
2. Dequeue
3. Print
4. peek
5. Clear
----------------
1
Masukkan data baru:31
Masukkan operasi yang di inginkan
1. Enqueue
2. Dequeue
3. Print
4. peek
5. Clear
----------------
4
Elemen Terdepan: 15
Masukkan operasi yang di inginkan
1. Enqueue
2. Dequeue
3. Print
4. peek
5. Clear
----------------
PS D:\CHRISTIAN_07_PASD26> ```

# Pertanyaan 
1. front dan rear bernilai -1 karena queue masih kosong, belum ada data yang menempati index manapun. Nilai -1 digunakan sebagai penanda "belum ada posisi valid". 
   Sedangkan size = 0 karena memang jumlah elemen yang ada di queue adalah nol.
2. Ini adalah implementasi circular queue. Jika rear sudah berada di posisi paling akhir array (max - 1), maka rear direset ke 0 agar memanfaatkan slot kosong di awal array. 
   Tanpa ini, array akan habis meski slot awal sudah kosong akibat dequeue.
3. Sama seperti nomor 2, ini juga bagian dari circular queue. Ketika front sudah di posisi terakhir array dan data di-dequeue, front direset ke 0 agar pembacaan data berikutnya kembali dari awal array.
4. Karena pada circular queue, data tidak selalu dimulai dari index 0. Posisi data terdepan ada di front, yang bisa berada di index mana saja. 
   Jika dimulai dari 0, data yang ditampilkan bisa salah urutan atau menampilkan slot kosong.
5. Ini adalah teknik wrapping circular array. Setelah i bertambah 1, di-modulo dengan max agar jika i melebihi batas array (mencapai max), nilainya kembali ke 0. Contoh: jika max = 5 dan i = 4, maka (4+1) % 5 = 0.
6. ``` if (IsFull()) {
            System.out.println("Queue sudah penuh");
        }  ```
7. ```   public void Enqueue(int dt){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else{
            if (IsEmpty()) {
                front =  rear = 0;
            } else{
                if (rear == max -1) {
                    rear =0;
                }else{
                    rear++;
                }
            }
            data [rear]=dt;
            size++;
        }
    }

    public int Dequeue (){
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        }else{
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            }else{
                if (front == max -1) {
                    front = 0;
                } else{
                    front++;
                }
            }
        }
        return dt;
    } ```


 
