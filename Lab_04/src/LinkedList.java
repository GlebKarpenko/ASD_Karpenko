import java.util.Scanner;

public class LinkedList {

    public class Node {

        STUDENT data;
        Node next;

        public Node(STUDENT aData) {
            this.data = aData;
            next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(STUDENT data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            tail = newNode;
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

    public Node searchNode() {

        Scanner in = new Scanner(System.in);
        System.out.print("\nВведіть ім'я студента для пошуку: ");
        String searchedName = in.nextLine();

        Node current = head;
        while (current != null) {

            if (current.data.NAME.equals(searchedName)) {
                current.data.getStudent();
                return current;
            }
            current = current.next;
        }
        System.out.println("Ім'я студента не знайдено.");
        return null;
    }

    public void insertNodeAfter(Node previousNode, STUDENT data) {

        if (previousNode == null) {
            System.out.println("Попередній елемент не може бути порожнім. ");
            return;
        }

        else {
            Node newNode = new Node(data);
            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
    }

    public void deleteNode(Node node){

        if (emptyCheck() == false){return;}

        if (node.equals(head) && node.equals(tail)){
            head = null;
            System.out.println("\nСписок видалено.");
            return;
        }

        if (node.equals(head) && node.next.equals(tail)){
            head = node.next;
            tail = node.next;
            return;
        }

        Node prev = head;

        while (prev != tail){

            if (prev.next.equals(node)){break;}
            prev = prev.next;
        }

        prev.next = prev.next.next;
    }

    public void displayList() {

        Node current = head;

        if (emptyCheck() == false) {return;}

        System.out.print("\nЕлементи однонаправленого списку: ");
        while (current != null) {

            current.data.getStudent();
            current = current.next;
        }
    }
}

