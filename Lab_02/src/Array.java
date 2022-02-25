import java.util.Scanner;

public class Array {

    int n;
    double arr[];
    int positive_numbers_count;
    int negative_numbers_count;
    int minElementIndex;
    int maxElementIndex;

    Array(int n) {

        this.n = n;
        arr = new double[this.n];
        positive_numbers_count = 0;
        negative_numbers_count = 0;
    }

    public void create() {

        System.out.println("Введіть елемнти масиву.");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < n; i++) {

            int count = i + 1;
            System.out.print(count + "-й елемент: ");
            arr[i] = in.nextDouble();
        }
    }

    public void find_sign_of_elements() {

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative_numbers_count = negative_numbers_count + 1;
            }

            if (arr[i] > 0) {
                positive_numbers_count = positive_numbers_count + 1;
            }
        }

        System.out.print("\nКількість додатних елементів: " + positive_numbers_count);
        System.out.println("\nКількість від'ємних елементів: " + negative_numbers_count);
    }

    public void max_minInterval_Multiplication() {

        double minElement = 0;
        double maxElement = 0;
        double multiplication = 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] < minElement) {
                minElement = arr[i];
                minElementIndex = i;
            }

            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxElementIndex = i;
            }
        }

        for (int i = 0; i < n; i++) {

            if ((i > minElementIndex && i < maxElementIndex) || (i > maxElementIndex && i < minElementIndex)) {
                multiplication = multiplication * arr[i];
            }
        }

        System.out.println("Максимальний елемент: " + maxElement + " З індексом: " + maxElementIndex);
        System.out.println("Мінімальний елемент: " + minElement + " З іедексом: " + minElementIndex);
        System.out.println("Добуток елементів в інтервалі між мінімальним та максимальним: " + multiplication);
    }

    public void find_increasing_sequence() {

        int count = 0;
        double arr1[] = new double[n - 1];

        for(int i = 0; i < n - 3; i++){
            arr1[i] = -999999;
        }

        for (int i = 1; i < n - 2; i++) {

            if ((arr[i - 1] < arr[i]) && (arr[i] < arr[i + 1])) {
                count = count + 1;
                arr1[i] = arr[i];
                arr1[i - 1] = arr[i - 1];
                arr1[i + 1] = arr[i + 1];
            }
        }

        if (this.arr[1] > this.arr[0]){
            arr1[0] = this.arr[0];
        }
        System.out.println("Кількість послідовно зростаючих елементів, не менше трьох: " + count);
        System.out.print("Трійки зростаючих елементів:   |");

       for (int j = 0; j < n - 3; j++) {

           if (j > 0) {
               if ((arr1[j] <= arr1[j - 1]) || (arr1[j + 1] <= arr1[j])) {
                   arr1[j - 1] = -999999;
               }

               if ((arr1[j] != -999999) && (arr1[j - 1] != -999999) && (arr[j + 1] != -999999)) {
                   System.out.print(arr1[j - 1] + "   " + arr1[j] + "   " + arr1[j + 1] + " | ");
               }
           }
       }

        System.out.println();
        Lab_02 lab_02 = new Lab_02();
        lab_02.menu();
    }

    public void show() {

        System.out.println("N: " + n);
        System.out.println("Масив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}
