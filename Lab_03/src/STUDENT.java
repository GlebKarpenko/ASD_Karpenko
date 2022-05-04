import java.util.Scanner;

public class STUDENT {

    String NAME;
    int GROUP;
    double[] SES = new double[5];

    double sum = 0;
    double avgSES = 0;

    int N;
    STUDENT[] STUD;

    public void setSTUD() {

        Scanner in = new Scanner(System.in);
        System.out.print("\n\nВведіть кількість учнів: ");
        N = in.nextInt();
        STUD = new STUDENT[N];

        for (int i = 0; i < N; i++) {

            STUDENT student1 = new STUDENT();
            System.out.print("\nВведіть ім'я студента: ");
            in.nextLine();
            student1.NAME = in.nextLine();
            System.out.print("Введіть групу студента: ");
            student1.GROUP = in.nextInt();

            for (int j = 0; j < 5; j++) {

                System.out.print("Введіь оцінки студента: ");
                student1.SES[j] = in.nextByte();
            }

            STUD[i] = student1;
        }
    }

    public void getSTUD(){

        for (int i = 0; i < N; i++){

            System.out.println(" Ім'я студента: " + STUD[i].NAME + " Група студента: " + STUD[i].GROUP);
            System.out.print(" Оцінки студента: ");
            for(int j = 0; j < 5; j++){

                System.out.print(STUD[i].SES[j] + " ");
            }
            System.out.println("");
        }
    }

    public void getSortSES(STUDENT student){

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {

                STUD[i].sum = STUD[i].sum + student.STUD[i].SES[j];
            }
            STUD[i].avgSES = STUD[i].sum / 5;
        }

        for (int i = 0; i < N; i++){

            if (STUD[i].avgSES >= 4){
                System.out.println(" Ім'я студента: " + STUD[i].NAME + " Група студента: " + STUD[i].GROUP);
            }
        }
    }

    public void mergeSTUD(STUDENT arr[], int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        STUDENT L[] = new STUDENT[n1];
        STUDENT R[] = new STUDENT[n2];

        int i = 0, j = 0;

        for (i = 0; i < n1; i++){

            L[i] = arr[left + i];
        }
        for (j = 0; j < n2; j++){

            R[j] = arr[middle + 1 + j];
        }

        int k = left;
        i = 0;
        j = 0;

        while (i < n1 && j < n2){

            if (L[i].GROUP <= R[j].GROUP) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void mergeSortSTUD(STUDENT arr[], int left, int right){
        int middle;
        if (left < right) {
            middle = (left + right) / 2;

            mergeSortSTUD(arr, left, middle);
            mergeSortSTUD(arr, middle + 1, right);

            mergeSTUD(arr, left, middle, right);
        }
    }

    public void displaySort(STUDENT student){

        mergeSortSTUD(STUD, 0, N - 1);

        for (int i = 0; i < N; i++){

            System.out.print("\n Ім'я студента: " + STUD[i].NAME + " Група студента " + STUD[i].GROUP);
            System.out.print("\n Оцінки студента: ");
            for (int j = 0; j < 5; j++){

                System.out.print(STUD[i].SES[j] + " ");
            }
        }
    }
}
