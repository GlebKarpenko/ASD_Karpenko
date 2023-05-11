import java.util.Scanner;

public class mergeSort {

    public void printArray(int[] arr){

        System.out.print("\nArray: ");

        for (int i = 0; i < arr.length; i++){

            System.out.print(arr[i] + " ");
        }
    }

    public int[] inputUnsortedArray() {

        int[] arr;
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput length of unsorted array: ");
        int n = in.nextInt();
        arr = new int[n];

        System.out.print("\nInput elements of the array: ");
        for (int i = 0; i < n; i++) {

            arr[i] = in.nextInt();
        }
        return arr;
    }

    public void sort(int[] arr, int l, int r){

        if (r > l){
            int mid = l + (r - l) / 2;

            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            merge(arr, l, r, mid);
        }
    }

    public void merge(int[] arr, int l, int r, int mid){

        int n1 = (mid - l) + 1;
        int n2 = (r - mid);

        int[] Left = new int [n1];
        int[] Right = new int [n2];

        for (int i = 0; i < n1; i++){

            Left[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++){

            Right[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0;
        int k = l;

        while((i < n1) && (j < n2)){

            if (Left[i] <= Right[j]){
                arr[k] = Left[i];
                i++;
            }

            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while(i < n1){

            arr[k] = Left[i];
            i++; k++;
        }

        while(j < n2){

            arr[k] = Right[j];
            j++; k++;
        }
    }

    public static void main(String[] args){

        ArrayMerge aM1 = new ArrayMerge();
        //int[] arr1 = aM1.inputArray1(), arr2 = aM1.inputArray2();
        //aM1.mergeArrays(arr1, arr2);

//        System.out.println("");
//        System.out.println("");
//        System.out.println("");

       // BinarySearch binarySearch = new BinarySearch();
       // binarySearch.searchElement(aM1.mergeArrays(arr1, arr2));

        mergeSort mS = new mergeSort();
        int[] arr = mS.inputUnsortedArray();
        mS.sort(arr, 0, arr.length - 1);
        mS.printArray(arr);

        BubbleSort bS = new BubbleSort();
        //mS.printArray(bS.sort(mS.inputUnsortedArray()));
    }
}
