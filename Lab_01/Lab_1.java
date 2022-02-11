import java.util.Scanner;
import java.lang.Math;

public class Lab_1 {

    public static void main(String[] args){
        menu();
    }

     public static void menu(){
        Scanner in = new Scanner(System.in);
        Boat boat1 = new Boat();
        Function function1 = new Function();
        Chess chess1 = new Chess();

        System.out.println("####МЕНЮ ПРОГРАМИ####");
        System.out.println("1.Задача на швидкість човна.");
        System.out.println("2.Обчислення значення функції.");
        System.out.println("3.Задача на координати шахової дошки.");
        System.out.println("0.Завершити програму.");

        int choice = 0;
        choice = in.nextInt();

        switch(choice){
            case 1 : boat1.solve();
            case 2 : function1.solve();
            case 3 : chess1.solve();
        }
    }
}
