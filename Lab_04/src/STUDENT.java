import java.util.Scanner;

public class STUDENT {

    String NAME;
    int GROUP;
    double[] SES = new double[5];

    public void getStudent(){

        System.out.print("\n Ім'я студента: " + NAME + " Група студента: " + GROUP);
        System.out.print(" Оцінки студента: ");
        for(int j = 0; j < 5; j++){

            System.out.print(SES[j] + " ");
        }
    }

    public STUDENT setStudent(){

        Scanner in = new Scanner(System.in);
        STUDENT student1 = new STUDENT();

        System.out.print("\nВведіть ім'я студента: ");
        student1.NAME = in.nextLine();

        System.out.print("\nВведіть групу студента: ");
        student1.GROUP = in.nextInt();

        System.out.println("Введіть оцінки студента.");
        for (int i = 0; i < 5; i++){

            student1.SES[i] = in.nextDouble();
        }

        return student1;
    }
}
