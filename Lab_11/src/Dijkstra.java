import java.util.*;

public class Dijkstra {

    public int[] distances;
    public HashSet<Integer> unsettled;
    public HashSet<Integer> settled;
    public int N;
    public int[][] matrix;

    public Dijkstra(int n) {

        this.N = n;
        this.distances = new int[n + 1];
        this.settled = new HashSet<Integer>();
        this.unsettled = new HashSet<Integer>();
        this.matrix = new int[n + 1][n + 1];
    }

    public int getMinDistance() {

        int min;
        int node = 0;

        Iterator<Integer> iterator = unsettled.iterator();
        node = iterator.next();
        min = distances[node];

        for (int i = 1; i <= distances.length; i++) {

            if (unsettled.contains(i) && distances[i] <= min) {
                min = distances[i];
                node = i;
            }
        }
        return node;
    }

    public void evaluateNeighbours(int evaluationNode) {

        int edgeDistance = -1;
        int newDistance = -1;

        for (int i = 1; i <= N; i++) {

            if (!settled.contains(i) && matrix[evaluationNode][i] != 999) {
                edgeDistance = matrix[evaluationNode][i];
                newDistance = distances[evaluationNode] + edgeDistance;

                if (newDistance < distances[i]) {
                    distances[i] = newDistance;
                }
                unsettled.add(i);
            }
        }
    }

    public void findPathDijkstra(int source, int aMatrix[][]) {

        int evaluationNode;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                matrix[i][j] = aMatrix[i - 1][j - 1];
            }
        }

        for (int i = 1; i <= N; i++) {

            distances[i] = 999;
        }

        unsettled.add(source);
        distances[source] = 0;

        while (!unsettled.isEmpty()) {

            evaluationNode = getMinDistance();
            unsettled.remove(evaluationNode);
            settled.add(evaluationNode);
            evaluateNeighbours(evaluationNode);
        }
    }
}

