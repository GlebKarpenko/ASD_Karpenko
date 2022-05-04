import java.util.Scanner;
import java.util.stream.StreamSupport;

public class CircularLinkedList {

    public class Node{

        String data;
        Node next;

        public Node(String data){

            this.data = data;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(String data){

        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void displayList(){

        Node current = head;

        if (emptyCheck() == false){return;}

        System.out.println("Елементи кільцевого списку: ");
        do {

            System.out.println(current.data + " ");
            current = current.next;
        } while (current != head);
    }

    public boolean emptyCheck(){
        if (head == null){
            System.out.println("Список порожній.");
            return false;
        }
        else{
            return true;
        }
    }

    public void deleteNode(String data){

        if (emptyCheck() == false){return;}

        Node node = head;
        Node prev = head;

        while(node.next != head){

            if (node.data == data){

                prev.next = node.next;
            }

            prev = node;
            node = node.next;
        }

        if ((node.next == head) && node.data == data){
            tail = prev;
            tail.next = head;
        }
    }

    public void divide(){

        if (emptyCheck() == false){return;}

        CircularLinkedList team2 = new CircularLinkedList();
        CircularLinkedList team1 = new CircularLinkedList();

        Node temp = head;

        for (int i = 0; i < 20; i++){

            team1.addNode(temp.data);
            temp = temp.next;
        }

        Node current = team1.head;

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 12; j++){

                if (j == 11){
                    team2.addNode(current.data);
                    team1.deleteNode(current.data);
                }
                current = current.next;
            }
        }

        System.out.println("Перша команда: ");
        team1.displayList();
        System.out.println();

        System.out.println("Друга команда: ");
        team2.displayList();
        System.out.println();
    }
}
