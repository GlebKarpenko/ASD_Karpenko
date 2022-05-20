import java.util.Scanner;

public class Array {

    int[] arr;

    public Array(){}

    public Array(int[] anArr){

        this.arr = anArr;
    }

    public int inputSize(){

        System.out.print("\nВведіть розмір масиву: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        return n;
    }

    public void inputArr(){

        Scanner in = new Scanner(System.in);
        int n = inputSize();
        this.arr = new int[n];
        int count = 1;

        for (int i = count - 1; i < n; i++){

            System.out.print("\nВвекдіть " + count + "-й елемент масиву: ");
            count++;
            this.arr[i] = in.nextInt();
        }
    }

    public void createRandArr(){

        Scanner in = new Scanner(System.in);
        int n = inputSize();

        System.out.print("\nВведіть максимальне та мінімальне випадкове значення масиву: ");
        int max = in.nextInt();
        int min = in.nextInt();
        this.arr = new int[n];

        for (int i = 0; i < n; i++) {
            this.arr[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
    }

    public void displayArr(){

        if (arr == null){
            System.out.println("Масив порожній.");
            return;
        }

        System.out.print("\nМасив: ");

        for (int i = 0; i < this.arr.length; i++){

            System.out.print( this.arr[i] + " ");
        }
    }
}
