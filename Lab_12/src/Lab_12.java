import java.util.Scanner;

public class Lab_12 {

    public void task1(DynamicArray A, DynamicArray B, DynamicArray C){

        System.out.print("\nПрограма для обчислення в трьох цілочисельних динамічних масивах добутку " +
                 "\nстількох елементів, сума яких не перевицує заданого цілого числа M.");
        System.out.print("\nВведіть M: ");
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int temp = 0;
        int m = 0;
        DynamicArray result = new DynamicArray(0);

        for (int i = 0; i < A.array.length; i++){
            for (int j = 0; j < B.array.length; j++){
                for (int k = 0; k < C.array.length; k++){

                    m = A.array[i] + B.array[j] + C.array[k];

                    if (m < M && m != 0){
                        temp = A.array[i] * B.array[j] * C.array[k];
                        result.add(temp);
                    }
                }
            }
        }

        System.out.print("\n\nМасив результат усіх добутків, які відповідають умові: ");
        System.out.println();

        for (int i = 0; i < result.array.length; i++){

            if (result.array[i] != 0){
                System.out.print(result.array[i] + "   ");
            }
        }
    }

    public static void main(String[] args){

        DynamicArray A = new DynamicArray(10);
        A.add(5);
        A.add(2);
        A.add(-3);
        A.add(4);
        A.add(9);
        A.add(16);
        A.add(72);
        A.add(-8);
        A.add(9);
        A.add(10);

        System.out.println("Масив A: ");
        A.print();
        System.out.println();

        DynamicArray B = new DynamicArray(12);
        B.add(1);
        B.add(-23);
        B.add(32);
        B.add(14);
        B.add(5);
        B.add(7);
        B.add(2);
        B.add(1);
        B.add(9);
        B.add(12);
        B.add(11);
        B.add(12);

        System.out.println("Масив B: ");
        B.print();
        System.out.println();

        DynamicArray C = new DynamicArray(8);

        C.add(12);
        C.add(-22);
        C.add(31);
        C.add(4);
        C.add(15);
        C.add(21);
        C.add(9);
        C.add(1);

        System.out.println("Масив C: ");
        C.print();
        System.out.println();

        Lab_12 lab = new Lab_12();
        lab.task1(A, B, C);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Заповнимо масиви випадковими числами.");

        A = new DynamicArray(1);
        B = new DynamicArray(1);
        C = new DynamicArray(1);

        A.fillWithRand(0, 9, -100, 100);
        B.fillWithRand(0, 11, -100, 100);
        C.fillWithRand(0, 7, -100, 100);

        lab.task1(A, B, C);

        System.out.println();
        System.out.println();
        System.out.println("Масив до змін: ");

        A.print();

        A.remove();
        A.removeAt(2);
        A.addAt(32, 17);
        A.removeAtWithPosition(9);

        System.out.println("Масив після змін: ");
        A.print();
    }
}
