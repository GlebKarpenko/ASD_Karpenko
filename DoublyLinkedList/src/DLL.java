public class DLL {

    public class Node {

        int data;
        Node next;
        Node prev;

        public Node(int aData){
            this.data = aData;
            next = null;
            prev = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){

        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{

            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){

        Node current = head;
        System.out.println("\n\nHead->Tail List Output: ");

        while (current != null){

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void reverseDisplay(){

        Node current = tail;
        System.out.println("\n\nTail->Head LIst Output: ");

        while (current != null){

            System.out.print(current.data + " ");
            current = current.prev;
        }
    }

    public static void main(String[] args){

        DLL list = new DLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);

        list.display();
        list.reverseDisplay();
    }
}
