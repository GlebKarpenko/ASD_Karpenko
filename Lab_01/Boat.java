import java.awt.*;
import java.util.Scanner;
import java.lang.Math;

public class Boat {

    public static void solve(){
       Lab_1 main = new Lab_1();

       System.out.println("Задача на визначення шляху, що пройшов човен.");
       double vBoat1, vBoat2, vRiver, tBoat1, tBoat2, S1, S2, S;
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть власну швидкість човна.(у км/год)");
        vBoat1 = in.nextDouble();
        System.out.println("Введіть швидкість течії.(у км/год)");
        vRiver = in.nextDouble();

        if (vRiver > vBoat1){
            System.out.println("Виникла помилка. Швидкість течії більша за швидкість човна.");
        }

        System.out.println("Введіть час за який човен йшов по озеру.(у год)");
        tBoat1 = in.nextDouble();
        System.out.println("Введіть час за який човен ішов проти течії.(у год)");
        tBoat2 = in.nextDouble();

        vBoat2 = vBoat1 - vRiver;
        S1 = vBoat1 * tBoat1;
        S2 = vBoat2 * tBoat2;
        S = S1 + S2;

        System.out.println("Човен усього пройшов " + S + "км");

        main.menu();
    }
}
