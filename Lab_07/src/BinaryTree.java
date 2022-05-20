public class BinaryTree {

    public class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {

            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root = null;

    public Node addNode(int data, Node current) {

        if (current == null) {
            current = new Node(data);
            return current;
        }

        if (data <= current.data){
            current.left = addNode(data, current.left);
        }

        if (data > current.data){
            current.right = addNode(data, current.right);
        }
        return current;
    }

    public void add(int data){
        root = addNode(data, root);
    }

    public int searchValue(int data, Node current, int count) {

        if (current == null) {
            return count;
        }

        if (data == current.data) {

            count++;
            return searchValue(data, current.left, count);
        }

        if (data < current.data) {
            return searchValue(data, current.left, count);
        }

        if (data > current.data) {
            return searchValue(data, current.right, count);
        }
        return count;
    }

    public void search(int data){

        int s = searchValue(data, root, 0);

            if (s > 0) {
                System.out.println("Кількість елементів зі значенням: " + data + " становить: " + s);
            } else {
                System.out.println("У дереві немає елемента з заданим значенням.");
            }
    }

    public void deleteNode(int data, Node current){

        if (current == null){
            return;
        }

        if (data == current.data){

            if (current.left == null && current.right == null){
                current = null;
                delMessage();
                return;
            }

            if (current.left == null){
                current = current.right;
                current.right = null;
                delMessage();
                return;
            }

            if (current.right == null){
                current = current.left;
                current.left = null;
                delMessage();
                return;
            }

            while (current.right != null){

                current.data = current.right.data;
                current = current.right;
            }
            delMessage();
            return;
        }

        if (data < current.data){
            deleteNode(data, current.left);
        }

        if (data > current.data){
            deleteNode(data, current.right);
        }
    }

    public void delMessage(){
        System.out.println("Елемент успішно видалено.");
    }

    public void delete(int data){

        deleteNode(data, root);
    }

    public int height(Node current){

        if (current == null){
            return 0;
        }
        else{
            int leftH = height(current.left);
            int rightH = height(current.right);

            if (leftH > rightH){
                return (leftH + 1);
            }
            else{
                return (rightH + 1);
            }
        }
    }

    public void printLevel(int level, Node current){

        if (current == null){
            return;
        }

        if (level == 1) {
            System.out.print(current.data + " ");
        }
        else if (level > 1) {
                printLevel(level - 1, current.left);
                printLevel(level - 1, current.right);
            }
    }

    public void printOrder(){
        int h = height(root);

        for (int i = 1; i <= h; i++){

            printLevel(i, root);
        }
    }

    public int E_initialize(Node current){

        int E = 0;
        Node subRoot = current;

        while (current.left.left != null){

            current = current.left;
            if (current.left == null && current.right != null){
                return E_initialize(subRoot.right);
            }
        }
        E = current.data;
        return E;
    }

    public void findNumberOF_E(){

        int E = E_initialize(root);
        System.out.println("\nПараметр E має значення: " + E);

        search(E);
    }

    public void TreeSort(Node current){

        if (current == null){
            return;
        }

        TreeSort(current.left);
        System.out.print(current.data + " ");
        TreeSort(current.right);
    }
}
