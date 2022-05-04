public class Lab_05 {

    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);

        list.display();
        list.convertToDLL();
        list.reverseDisplay();
    }
}
