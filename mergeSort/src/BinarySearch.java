import java.util.Scanner;

public class BinarySearch {

    public void searchElement(int[] arr) {

        System.out.print("\nInput searched element: ");
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int n = arr.length;

        if (binarySearch(arr, x) == -1){
            System.out.println("The element is not present in the array.");
        }

        else{
            System.out.println("The index of x in the array is: " + binarySearch(arr, x));
        }
    }

    public int binarySearch(int[] arr, int x) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                right = mid - 1;
            }

            if (arr[mid] < x) {
                left = mid + 1;
            }
        }
        return -1;
    }
}

