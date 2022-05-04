public class Stack {

    public class Node{

        int data;
        Node prev;

        public Node(int aData){
            this.data = aData;
            prev = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void push(int data){

        Node node = new Node(data);
        Node temp = tail;
        if (head == null){
            head = node;
            tail = node;
        }
        else{
            tail = node;
            tail.prev = temp;
        }
    }

    public boolean emptyCheck(){
        if (head == null){
            System.out.println("Список порожній.");
            return false;
        }
        else {
            return true;
        }
    }

    public void pop(){

        if (emptyCheck() == false){return;}

        Node current = tail;
        tail = current.prev;
        current = null;
    }

    public void print(){

        Node current = tail;
        System.out.print("Елементи стеку: ");

        while(current != null){

            System.out.print(current.data + " ");
            current = current.prev;
        }
    }

    public void searchMIN(){

        Node current = tail;
        int min = tail.data;

        while (current != null){

            if (current.data < min){
                min = current.data;
            }
            current = current.prev;
        }
        System.out.print("Мінімальний елемент стеку: " + min);
    }
}
