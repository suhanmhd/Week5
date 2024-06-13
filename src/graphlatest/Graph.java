package graphlatest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V;
    private ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {

        this.V = V;
        this.adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest) {

        adj.get(src).add(dest);
    }
    public  ArrayList<ArrayList<Integer>> getAdjList() {
        return adj;
    }
    public  void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer neighbor : adj.get(i)) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }

    }
    public  void bfsTraversal() {
        boolean[] vis = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i<V; i++) {
            if (!vis[i]){
                queue.offer(i);
                vis[i] = true;

                while (!queue.isEmpty()) {
                    int vertex = queue.poll();
                    System.out.println(vertex);
                    for (Integer adjNode : adj.get(vertex)) {
                        if(!vis[adjNode]) {
                            queue.offer(adjNode);
                            vis[adjNode] = true;
                        }
                    }

                }
            }
        }

    }

    public void dfsTraversal() {
        boolean vis[] = new boolean[V];
        for(int i =0;i<V;i++) {
            if(!vis[i]) {
                dfsHelper( i, vis);

            }
        }
    }
    public void  dfsHelper(int curr,boolean vis[]) {
       vis[curr] = true;
        System.out.println(curr);

       for (Integer newNode : adj.get(curr)){
           if(!vis[newNode]){
               dfsHelper(newNode,vis);
           }
       }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(4);


        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.printGraph();
        graph.bfsTraversal();
        System.out.println();
        graph.dfsTraversal();
    }


}
