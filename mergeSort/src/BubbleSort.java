import java.util.Scanner;

public class BubbleSort {

    public int[] sort(int[] arr){

        int k;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){

                if ((j + 1) == arr.length){
                    break;
                }

                if (arr[j] > arr[j + 1]){
                    k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }

        return arr;
    }
}
