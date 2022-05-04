import java.util.Scanner;

public class LinkedList {

    public class Node {

        int data;
        Node next;
        Node prev;

        public Node(int aData) {
            this.data = aData;
            next = null;
            prev = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public Node P1 = head;

    public boolean emptyCheck(){
        if (head == null){
            System.out.println("Список порожній.");
            return false;
        }
        else {
            return true;
        }
    }

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){

        Node current = head;

        if (emptyCheck() == false){return;};

        System.out.print("\nЕлементи списку з початку в кінець: ");
        while (current != null){

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void convertToDLL() {

        if (emptyCheck() == false) {return;}

        Node current = head;

        while (current.next != null){

            current.next.prev = current;
            current = current.next;
        }
    }

    public void reverseDisplay(){

        if (emptyCheck() == false) {return;}

        Node current = tail;
        System.out.print("\nЕлементи двонаправленого списку з кінця на початок: ");

        do{

            System.out.print(current.data + " ");
            current = current.prev;
        }while(current != null);
        System.out.println();
    }
}

