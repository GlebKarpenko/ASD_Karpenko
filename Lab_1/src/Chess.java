import java.util.Scanner;
import java.lang.Math;

public class Chess {
    public static void solve(){
        Lab_1 main = new Lab_1();
        Scanner in = new Scanner(System.in);

        String[][] field;
        field = new String[8][8];

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                field[i][j] = i + ":" + j;
                System.out.print(field[i][j] + "    ");
            }
            System.out.println();
        }

        boolean b = false;
        int x1, y1, x2, y2, sum1, sum2, dif1, dif2;
        System.out.println("Ведіть координати початкової точки.");
        x1 = in.nextInt(); y1 = in.nextInt();
        System.out.println("Введіть координати точки переміщення.");
        x2 = in.nextInt(); y2 = in.nextInt();

        if (x1 == x2 || y1 == y2){
            b = true;
        }

        sum1 = x1 + y1;
        sum2 = x2 + y2;
        dif1 = x2 - x1;
        dif2 = y2 - y1;

        if (sum1 == sum2){
            b = true;
        }

        if (dif1 == dif2){
            b = true;
        }

        System.out.println(b);

        main.menu();
    }
}
