package Pertemuan12;

public class SingleLinkedList07 {
    Node07 head;
    Node07 tail;

     boolean isEmpty() {
        return (head == null);
    }
 
    public void print() {
        if (!isEmpty()) {
            Node07 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

      public void addFirst(mahasiswa07 input) {
        Node07 ndInput = new Node07(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
 
    public void addLast(mahasiswa07 input) {
        Node07 ndInput = new Node07(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
 
    public void insertAfter(String key, mahasiswa07 input) {
        Node07 ndInput = new Node07(input, null);
        Node07 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
 
    public void insertAt(int index, mahasiswa07 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node07 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node07(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    
}
