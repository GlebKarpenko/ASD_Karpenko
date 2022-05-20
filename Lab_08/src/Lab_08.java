import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Lab_08{

    public void search(int[] arr1, int[] arr2){

        System.out.println("Елементи, які присутні в обох масивах: ");
        int k = 0;
        int temp;

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){

                if (arr1[i] == arr2[j]){
                    temp = arr1[i];
                    if (k +1 != arr1.length){
                        arr1[i] = arr1[k];
                        arr2[j] = arr2[k];
                        arr1[k] = temp;
                        arr2[k] = temp;
                        k++;
                    }
                    System.out.print(temp + " ");
                }
            }
        }
    }

    public void menu(Array arr1, Array arr2){

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("####Меню програми####");
        System.out.println("1. Ввести масиви вручну.");
        System.out.println("2. Заповнити масиви випадковими значеннями.");
        System.out.println("3. Пошук з перестановкою в початок елементів, які присутні в обох масивах.");
        System.out.println("4. Вивести масиви: ");

        System.out.println("0. Завершити роботу програми.");

        int choice = in.nextInt();

        switch (choice){

            case 1 : arr1.inputArr();
            arr2.inputArr();
            menu(arr1, arr2);
            break;

            case 2 : arr1.createRandArr();
            arr2.createRandArr();
            menu(arr1, arr2);
            break;

            case 3 : search(arr1.arr, arr2.arr);
            menu(arr1, arr2);
            break;

            case 4 : arr1.displayArr();
            arr2.displayArr();
            menu(arr1, arr2);
            break;

            case 0 : System.out.println("Роботу завершено."); break;
        }
    }

    public static void main(String[] args){

        Array arr1 = new Array();
        Array arr2 = new Array();

        Lab_08 lab = new Lab_08();
        lab.menu(arr1, arr2);
    }
}