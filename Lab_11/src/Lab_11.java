import java.util.Scanner;

public class Lab_11 {

    public void menu(int matrix[][], int N) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Натисніть 1 щоб знайти найкоротший шлях між заданими " +
                "вершинами за допомогою алгоритму Дейкстри.");
        System.out.println("Натисніть 2 щоб знайти матрицю відстаней між " +
                "вершинами за допомогою алгоритму Флойда-Уоршелла");
        System.out.println("Натисніть 0 щоб завершити роботу програми.");
        choice = in.nextInt();

        Dijkstra alg1 = new Dijkstra(N);

        switch (choice) {

            case 1:

                System.out.print("\nВведіть початкову вершину: ");
                int source = in.nextInt();
                System.out.print("\nВвведіть кінцеву вершину: ");
                int destination = in.nextInt();

                if (source == 0 || destination == 0) {
                    System.out.println("Виникла помилка! Данні введено невірно.");
                    return;
                }

                alg1.findPathDijkstra(source, matrix);

                System.out.println("Найкоротший шлях з вершини " + source + " до вершини " + destination + " становить: ");

                for (int i = 1; i <= alg1.distances.length - 1; i++) {

                    if (alg1.distances[i] == 999){
                        alg1.distances[i] = 0;
                    }

                    if (i == destination) {
                        System.out.println(alg1.distances[i]);
                    }
                }
                menu(matrix, N);
                break;

            case 2:

                FloydWarshall alg2 = new FloydWarshall();
                alg2.findPathFloydWarshall(matrix, N);
                menu(matrix, N);
                break;

            case 0:
                System.out.println("Робту завершено.");
                break;
        }
    }

    public static void main(String[] args) {

        int N = 12;
        int[][] matrix = {
               //1  2  3  4  5  6  7  8  9  10 11 12
                {0, 7, 0, 5, 8, 0, 0, 4, 0, 0, 0, 0},//1
                {0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0},//2
                {0, 8, 0, 0, 6, 2, 0, 7, 0, 0, 0, 0},//3
                {0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0},//4
                {0, 0, 0, 5, 0, 9, 0, 6, 0, 0, 0, 0},//5
                {0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0},//6
                {0, 0, 0, 8, 0, 0, 0, 0, 0, 3, 0, 0},//7
                {0, 0, 0, 0, 0, 5, 3, 0, 2, 4, 5, 6},//8
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7},//9
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//10
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 9},//11
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//12
        };

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][j] = 999;
                }
            }
        }

        Lab_11 lab = new Lab_11();
        lab.menu(matrix, N);
    }
}
