package adjacencyMatrix;
//
//public class Graph {
//    private int v; // Number of vertices
//    private int[][] adjacencyMatrix;
//
//    public Graph(int v) {
//        this.v = v;
//        this.adjacencyMatrix = new int[v][v];
//    }
//
//    public void addEdge(int src, int dest) {
//        // Add an edge from src to dest (and vice versa for an undirected graph)
//        adjacencyMatrix[src][dest] = 1;
//        adjacencyMatrix[dest][src] = 1;
//    }
//
//    public void DFS(int startVertex) {
//        boolean[] visited = new boolean[v];
//        DFSHelper(startVertex, visited);
//    }
//
//    private void DFSHelper(int vertex, boolean[] visited) {
//        visited[vertex] = true;
//        System.out.print(vertex + " ");
//
//        for (int i = 0; i < v; i++) {
//            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
//                DFSHelper(i, visited);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int numVertices = 7; // Change this to the desired number of vertices
//        Graph graph = new Graph(numVertices);
//
//        // Add edges to the graph
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 2);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(2, 4);
//        graph.addEdge(5, 6);
//
//        // Perform DFS starting from vertex 0
//        System.out.println("DFS starting from vertex 0:");
//        graph.DFS(0);
//    }
//}


import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int v; // Number of vertices
    private int[][] adjacencyMatrix;

    public Graph(int v) {
        this.v = v;
        this.adjacencyMatrix = new int[v][v];
    }

    public void addEdge(int src, int dest) {
        // Add an edge from src to dest (and vice versa for an undirected graph)
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1;
    }

    public void DFS() {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                DFSHelper(i, visited);
            }
        }
    }

    private void DFSHelper(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < v; i++) {
            if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                DFSHelper(i, visited);
            }
        }
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int i = 0; i < v; i++) {
                if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int numVertices = 5; // Change this to the desired number of vertices
        Graph graph = new Graph(numVertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        // Perform DFS
        System.out.println("DFS:");
        graph.DFS();

        // Perform BFS starting from vertex 0
        System.out.println("\nBFS starting from vertex 0:");
        graph.BFS(0);
    }
}
