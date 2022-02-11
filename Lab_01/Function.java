import java.util.Scanner;
import java.lang.Math;

public class Function {
    public static void solve(){
        Lab_1 main = new Lab_1();

        double x, y, a, b, c, numerator;
        System.out.println("Введіть x");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = ((double) Math.pow((x + 1), 2) + ((x + 1) * 2))/4;

        System.out.println("Значення y: " + y);

        main.menu();
    }
}
