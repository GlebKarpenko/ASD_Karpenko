import java.util.*;
import java.util.Scanner;

public class Main {

    public void findPath(int aMatrix[][], int N){

        int dist[][] = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){

                dist[i][j] = aMatrix[i][j];
            }
        }

        for (int k = 0; k < N; k++){
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){

                    if (dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        printDist(dist, N);
    }

    public void printDist(int dist[][], int N){

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){

                if (dist[i][j] == 999){
                    System.out.print(0);
                }
                else{
                    System.out.print(dist[i][j] + "   ");
                }
            }
            System.out.println();
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

        Main obj = new Main();
        obj.findPath(matrix, N);
    }
}
