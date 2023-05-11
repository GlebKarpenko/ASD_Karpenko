public class GenericTree {

    public class Node {

        int data;
        Node firstChild;
        Node nextSibling;

        public Node(int data, Node firstChild, Node nextSibling) {

            this.data = data;
            this.firstChild = firstChild;
            this.nextSibling = nextSibling;
        }
    }

    Node root = null;

    public boolean checkIFempty(){

        if (root == null){
            System.out.println("Дерево порожнє.");
            return true;
        }
        else{
            return false;
        }
    }

    public Node addNode(int data1, Node firstChild, Node nextSibling){

        Node newNode = new Node(data1, firstChild, nextSibling);

        return newNode;
    }

    public void printTree(Node current) {

        while (current != null) {

            if (current.nextSibling != null) {
                current = current.nextSibling;
                break;
            }
            current = current.firstChild;
        }

        Node temp = current;
        System.out.print("\nParent node: " + current.data + " ");
        System.out.print("\nSibling nodes: ");

        while (current != null){

            System.out.print(current.data + " ");
            current = current.firstChild;
        }
        printTree(temp);
    }

    public static void main(String[] args){


        //not working program, improvement needed in printTree function

        GenericTree tree = new GenericTree();

        Node n2 = tree.addNode(2, null, null);
        Node n1 = tree.addNode(1, n2, null);
        Node n9 = tree.addNode(3, null, null);
        Node n3 = tree.addNode(3, n9, n1);
        Node n4 = tree.addNode(4, null, n3);
        Node n5 = tree.addNode(1, null, null);
        Node n6 = tree.addNode(2, n4, n5);
        Node n7 = tree.addNode(1, n6, null);
        Node n8 = tree.addNode(5, null, n7);
        tree.root = n8;

        tree.printTree(tree.root);
    }
}
