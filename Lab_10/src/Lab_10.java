import java.util.Scanner;

public class Lab_10{

    public int charConverter(char a) {

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int number = 0;
        for (int i = 1; i < letters.length + 1; i++) {

            if (a == letters[i - 1]) {
                number = i;
                return number;
            }
        }
        return number;
    }

    public void menu(int matrix[][]){

        Scanner in = new Scanner(System.in);
        int choice = 0;
        Lab_10 lab = new Lab_10();

        System.out.println("Натисніть 1 щоб знайти найкоротший шлях між заданими " +
                "вершинами за допомогою алгоритму Дейкстри.");
        System.out.println("Натисніть 2 щоб знайти матрицю відстаней між " +
                "вершинами за допомогою алгоритму Флойда-Уоршелла");
        System.out.println("Натисніть 0 щоб завершити роботу програми.");
        choice = in.nextInt();

        Dijkstra alg1 = new Dijkstra(8);

        switch(choice) {

            case 1:

                System.out.print("\nВведіть початкову вершину: ");
                char sourceChar = in.next().charAt(0);
                System.out.print("\nВвведіть кінцеву вершину: ");
                char destinationChar = in.next().charAt(0);

                int source = lab.charConverter(sourceChar);
                int destination = lab.charConverter(destinationChar);

                if (source == 0 || destination == 0) {
                    System.out.println("Виникла помилка! Данні введено невірно.");
                    return;
                }

                alg1.findPathDijkstra(source, matrix);

                System.out.println("Найкоротший шлях з вершини " + sourceChar + " до вершини " + destinationChar + " становить: ");

                for (int i = 1; i <= alg1.distances.length - 1; i++) {

                    if (alg1.distances[i] == 999){
                        alg1.distances[i] = 0;
                    }

                    if (i == destination) {
                        System.out.println(alg1.distances[i]);
                    }
                }
                menu(matrix);
                break;

            case 2 :

                FloydWarshall alg2 = new FloydWarshall();
                alg2.findPathFloydWarshall(matrix, 8);
                menu(matrix);
                break;

            case 0 :
                System.out.println("Робту завершено.");
                break;
        }
    }

    public static void main(String[] args){

        int N = 8;
        int[][] matrix = {
                {0, 1, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 0, 1, 1, 1},
                {0, 0, 1, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 1, 0, 0, 1},
                {0, 0, 0, 0, 1, 1, 1, 0}
        };

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){

                if (matrix[i][j] == 0){
                    matrix[i][j] = 999;
                }
            }
        }

        Lab_10 lab = new Lab_10();
        lab.menu(matrix);
    }
}