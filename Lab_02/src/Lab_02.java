import java.util.Scanner;

public class Lab_02 {

    public static void main(String[] args){

        menu();
    }

    public static void menu(){

        System.out.println("-------МЕНЮ ПРОГРАМИ--------");
        System.out.println("1.Одновимірний масив.");
        System.out.println("2.Прямокутна матриця.");
        System.out.println("3.Квадратна матриця.");
        System.out.println("0.Завершити роботу.");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        switch(choice){
            case 1 :
                System.out.println("Ведіть довжину масиву.");
                int length = in.nextInt();
                Array array = new Array(length);

                array.create();
                array.show();
                array.find_sign_of_elements();
                array.max_minInterval_Multiplication();
                array.find_increasing_sequence();

                break;

            case 2 :
                System.out.println("Введіть кількість рядків та стовпців матриці.");
                int n = in.nextInt();
                int m = in.nextInt();
                Matrix_nxm matrix_nxm = new Matrix_nxm(n, m);

                matrix_nxm.create();
                matrix_nxm.show();
                matrix_nxm.no_zeros_found();
                matrix_nxm.find_max();

                break;

            case 3 :
                System.out.println("Введіть розмірність матриці");
                int N = in.nextInt();
                Matrix_nxn matrix_nxn = new Matrix_nxn(N);

                matrix_nxn.create();
                matrix_nxn.show();

                break;

            case 0 : break;
        }
    }
}
