public class StackKonversi07 {
    int [] tumpukanBiner;
    int size;
    int top;

    public StackKonversi(){
    this.size = 32; 
    tumpukanBiner = new int [size];
    top = -1;
}
 public boolean isEmpty() {
    return top == -1;
 }

 public boolean isfull(){
    return top == size -1;
 }

 public void push(int data){
    if (isfull()) {
        System.out.println("Stack penuh");
    } else{
        top++;
        tumpukanBiner[top] = data;
    }
 }

 public int pop (){
    if (isEmpty()) {
        System.out.println("Stack kosong.");
        return -1;
    } else{
        intdata = tumpukanBiner[top];
        top--;
        return data;
    }
 }
}




