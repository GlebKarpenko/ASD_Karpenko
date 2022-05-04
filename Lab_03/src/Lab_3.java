import java.util.Scanner;

public class Lab_3 {

    public static void menu(STUDENT student) {

        System.out.print("-----------МЕНЮ ПРОГРАМИ-------------\n");
        System.out.print("1. Ввести з клавіатури данні у масив STUD, що складається з N змінних типу STUDENT.\n");
        System.out.print("2. Впорядкувати записи за зростанням значень поля GROUP.\n");
        System.out.print("3. Вивести на екран прізвища і номера груп студентів середній бал яких вище за 4.0\n");
        System.out.print("0. Завершити роботу.\n");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch (choice) {

            case 1:
                student.setSTUD();
                student.getSTUD();
                menu(student);
                break;

            case 2:
                student.displaySort(student);
                menu(student);
                break;
            case 3:
                student.getSortSES(student);
                menu(student);
                break;
            default:
                System.out.println("Роботу програми завершено.");
                break;
        }
    }

    public static void main(String[] args) {

        STUDENT student = new STUDENT();
        menu(student);
    }
}