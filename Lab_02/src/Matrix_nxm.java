import java.util.Scanner;
import java.lang.Math;

public class Matrix_nxm {

    int n;
    int m;
    int matrix[][];
    int no_zero_row_count;
    int arr1_max[][];

    public Matrix_nxm(int n, int m){

        this.n = n;
        this.m = m;
        this.matrix = new int[this.n][this.m];
        this.no_zero_row_count = 0;
        this.arr1_max = new int[this.n][this.m];
    }

    public void create(){

        Scanner in = new Scanner(System.in);
        System.out.println("1.Ввести елементи матриці.");
        System.out.println("2.Сгененерувати випадкову матрицю(від -100 до 100).");
        int choice = in.nextInt();

        switch (choice){
            case 1 :
                System.out.println("Введіть елементи матриці.");

                for (int i = 0; i < this.n; i++) {
                    for (int j = 0; j < this.m; j++) {

                        int row = i + 1;
                        int column = j + 1;
                        System.out.println(row + ":" + column + "-й елемент");
                        this.matrix[i][j] = in.nextInt();
                    }
                }
                break;

            case 2 :
                create_random();
                break;
        }
    }

    public void create_random(){

        int max = 100;
        int min = -100;

        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < this.m; j++){

                this.matrix[i][j] = (int)Math.floor(Math.random()*(max-min+1)+min);
            }
        }
    }

    public void show(){

        System.out.println("Матриця" + this.n +"x" + this.m);

        for (int i = 0; i < this.n; i++){
            for (int j = 0; j < this.m; j++){

                System.out.print(this.matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public void no_zeros_found() {

        int count = this.n;

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {

                if (matrix[i][j] == 0){
                    count = count - 1;
                    break;
                }
            }
        }
        System.out.println("Кількість рядків, які не мають нулів: " + count);
    }

    public void find_max(){

        int max = 0;
        int max_n = 0;
        int max_m = 0;
        int count2 = 1;
        count2++;

        for (int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){

                if((this.matrix[i][j] > max) && this.matrix[i][j] != arr1_max[i][j]){
                    max = this.matrix[i][j];
                    max_n = i;
                    max_m = j;
                }
            }
        }
        find_max_repeat(max, max_n, max_m, count2);
    }

    public void find_max_repeat(int max, int max_n, int max_m, int count2) {

        int max_repeat = 0;

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {

                if ((max == this.matrix[i][j]) && (max_n != i) && (max_m != j)) {
                    max_repeat = max;
                    find_max_repeat_finish(max_repeat);
                    break;
                }
            }
        }

        if (count2 == 10){
            find_max_repeat_finish(max_repeat);
        }

        if (max_repeat == 0){
            this.arr1_max[max_n][max_m] = max;
            find_max();
        }
    }

    public void find_max_repeat_finish(int max_repeat){

        if (max_repeat != 0){
            System.out.println("Максимальний елемент, який провторюється понад один раз: " + max_repeat);
        }

        if (max_repeat == 0){
            System.out.println("Не має елемента, який повторюється понад один раз.");
        }
        System.out.println();
        Lab_02 lab_02 = new Lab_02();
        lab_02.menu();
    }
}
