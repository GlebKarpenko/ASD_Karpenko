

public class FloydWarshall {

    public void findPathFloydWarshall(int aMatrix[][], int N){

        int dist[][] = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {

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

    public void printDist(int matrix[][], int N){

        System.out.println("Матриця відстаней між вершинами, знайдена " +
                "алгоритмом Флойда-Уоршелла: ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (i == 0 && j == 0){
                    for (int k = 1; k <= N; k++){
                        if (k < 10){
                            System.out.print(k + "    ");
                        }
                        if (k >= 10 && k < 100){
                            System.out.print(k + "   ");
                        }
                    }
                    System.out.println();
                    System.out.println();
                }

                if (matrix[i][j] == 999) {
                    matrix[i][j] = 0;
                }
                if (matrix[i][j] < 10) {
                    System.out.print(matrix[i][j] + "    ");
                }
                if (matrix[i][j] >= 10 && matrix[i][j] < 100){
                    System.out.print(matrix[i][j] + "   ");
                }
                if (matrix[i][j] >= 100 && matrix[i][j] < 1000){
                    System.out.print(matrix[i][j] + "  ");
                }
                if (j + 1 == N){
                    int count = i + 1;
                    System.out.print(" --" + count);
                }
            }
                System.out.println();
        }
    }
}
