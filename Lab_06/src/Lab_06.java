public class Lab_06 {

    public static void main(String[] args){

        System.out.println();
        System.out.println("Створення нового стеку, додавання 5-ти елементів до стеку.");
        Stack stack = new Stack();
        stack.push(4);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(4);

        System.out.println("Друкування створеного стеку.");
        stack.print();
        System.out.println();
        System.out.println();

        System.out.println("Видалення елемента зі стеку.");
        stack.pop();

        System.out.println("Друкування зміненого стеку.");
        stack.print();
        System.out.println();
        System.out.println();

        System.out.println("Пошук мінімального елемента у стеці.");
        stack.searchMIN();
    }
}
