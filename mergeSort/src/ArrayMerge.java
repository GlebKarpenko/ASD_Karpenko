import java.util.Scanner;

public class ArrayMerge {

    public int[] inputArray1(){

        int[] arr1;
        int n1;
        Scanner in = new Scanner(System.in);

        System.out.print("Input size of array1: ");
        n1 = in.nextInt();
        arr1 = new int[n1];

        System.out.print("Input elements of array1: ");
        for (int i = 0; i < n1; i++){

            arr1[i] = in.nextInt();
        }

        return arr1;
    }

    public int[] inputArray2(){

        int[] arr2;
        int n2;
        Scanner in = new Scanner(System.in);

        System.out.print("\nInput size of array2: ");
        n2 = in.nextInt();
        arr2 = new int[n2];

        System.out.print("\nInput elements of array2: ");
        for (int i = 0; i < n2; i++){
            arr2[i] = in.nextInt();
        }

        return arr2;
    }

    public int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] mergeArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0;

        for(int k = 0; k < mergeArr.length; k++){

            if (arr1[i] <= arr2[j]){
                mergeArr[k] = arr1[i];
                i = i + 1;
                if (i == arr1.length){
                    mergeArr[k + 1] = arr2[j];
                    break;
                }
            }

            else {
                mergeArr[k] = arr2[j];
                j = j + 1;
                if (j == arr2.length){
                    mergeArr[k + 1] = arr1[i];
                    break;
                }
            }
        }

        printMergeArr(mergeArr, arr1, arr2);
        return mergeArr;
    }

    public void printMergeArr(int[] mergeArr, int[] arr1, int[] arr2){

        System.out.print("First sorted array: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");

        System.out.print("Second sorted array: ");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");

        System.out.print("Merged Array: ");
        for (int i = 0; i < mergeArr.length; i++){
            System.out.print(mergeArr[i] + " ");
        }
    }
}
