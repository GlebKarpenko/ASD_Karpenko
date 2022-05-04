import java.util.Scanner;

public class Lab_04 {

    public static void menuHead(){

        System.out.println("#######МЕНЮ ПРОГРАМИ#######");
        System.out.println("    Однонаправлений список: ");
        System.out.println("1. Додати нового студента у кінець списку.");
        System.out.println("2. Додати нового студента після заданого елементу.");
        System.out.println("3. Знайти студента за іменем.");
        System.out.println("4. Видалити елемент зі списку.");
        System.out.println("5. Друкувати список.");
        System.out.println("6. Вивести кільцевий список з 20 гравцями.");
        System.out.println("7. Зозділити гравців на дві команди.");
        System.out.println("0. Завершити роботу.");
    }

    public static void menu(LinkedList list, STUDENT stud1, CircularLinkedList circularList){

        System.out.println();
        System.out.println("#######МЕНЮ ПРОГРАМИ#######");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch(choice){

            case 1 : list.addNode(stud1.setStudent());
            menu(list, stud1, circularList);
            break;

            case 2 : list.insertNodeAfter(list.searchNode(), stud1.setStudent());
            menu(list, stud1, circularList);
            break;

            case 3 : list.searchNode();
            menu(list, stud1, circularList);
            break;

            case 4 : list.deleteNode(list.searchNode());
            menu(list, stud1, circularList);
            break;

            case 5 : list.displayList();
            menu(list, stud1, circularList);
            break;

            case 6 : circularList.displayList();
            menu(list, stud1, circularList);
            break;

            case 7 : circularList.divide();
                menu(list, stud1, circularList);
                break;

            default : System.out.println("Роботу програми завершено."); break;
        }
    }

    public static void main(String[] args) {

        menuHead();
        LinkedList list = new LinkedList();
        STUDENT stud1 = new STUDENT();

        CircularLinkedList cL = new CircularLinkedList();
        cL.addNode("Player1");
        cL.addNode("Player2");
        cL.addNode("Player3");
        cL.addNode("Player4");
        cL.addNode("Player5");//#5
        cL.addNode("Player6");
        cL.addNode("Player7");
        cL.addNode("Player8");
        cL.addNode("Player9");
        cL.addNode("Player10");//#10
        cL.addNode("Player11");
        cL.addNode("Player12");
        cL.addNode("Player13");
        cL.addNode("Player14");
        cL.addNode("Player15");//#15
        cL.addNode("Player16");
        cL.addNode("Player17");
        cL.addNode("Player18");
        cL.addNode("Player19");
        cL.addNode("Player20");//#20

        menu(list, stud1, cL);
    }
}
