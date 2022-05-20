import java.util.Scanner;

public class Lab_09 {

    public void bubbleSort(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            count++;
            int swapCount = 0;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
            if (swapCount == 0){
                break;
            }
        }
        Array Arr = new Array(arr);
        Arr.displayArr();

        System.out.println("Кількість ітерацій: " + count);
    }

    public void eachIterationSort(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            count++;
            int swapCount = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
            if (swapCount == 0){
                break;
            }

            System.out.print("\n\n" + count + "-а ітерація: ");
            Array Arr = new Array(arr);
            Arr.displayArr();
        }
    }

    public void menu(Array arr1){

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("\n\n####Меню програми####");
        System.out.println("1. Ввести масив вручну.");
        System.out.println("2. Заповнити масив випадковими значеннями.");
        System.out.println("3. Вивести відсотрований масив з кількістю ітерацій.");
        System.out.println("4. Вивести кожну ітерацію та підсумковий відсортований масив.");
        System.out.println("5. Вивести масив.");

        System.out.println("0. Завершити роботу програми.");

        int choice = in.nextInt();

        switch (choice){

            case 1 : arr1.inputArr();
                menu(arr1);
                break;

            case 2 : arr1.createRandArr();
                menu(arr1);
                break;

            case 3 :
                bubbleSort(arr1.arr);
                menu(arr1);
                break;

            case 4 :
                eachIterationSort(arr1.arr);
                menu(arr1);
                break;
            case 5 :
                arr1.displayArr();
                menu(arr1);
                break;

            case 0 : System.out.println("Роботу завершено."); break;
        }
    }

    public static void main(String[] args){

        Lab_09 lab = new Lab_09();
        Array arr = new Array();
        lab.menu(arr);
    }
}
