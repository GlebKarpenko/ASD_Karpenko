public class Lab_07{

    public static void main(String[] args) {

        //Завдання №1
        BinaryTree BS = new BinaryTree();
        BS.add(3);
        BS.add(1);
        BS.add(7);
        BS.add(5);
        BS.add(1);
        BS.add(8);
        BS.add(3);
        BS.add(2);
        BS.add(10);
        BS.add(3);

        BS.search(7);
        BS.search(111);

        BS.search(3);

        System.out.println("Обхід дерева вшир: ");
        BS.printOrder();

        BS.findNumberOF_E();

        //Завдання №2
        BinaryTree storage1 = new BinaryTree();
        BinaryTree storage2 = new BinaryTree();

        int[] arr = new int[]{45, 56, 13, 75, 14, 18, 43, 11, 52, 12, 10, 36, 47, 9};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                storage1.add(arr[i]);
            }
            else{
                storage2.add(arr[i]);
            }
        }

        System.out.println("\nДеталі першого складу: ");
        storage1.printOrder();

        System.out.println("\nДеталі другого складу: ");
        storage2.printOrder();

        System.out.println("\nВідсортоване дерево по-черзі (перший склад): ");
        storage1.TreeSort(storage1.root);
    }
}