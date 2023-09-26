package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

    class Edge{
        int src;
        int dest;

        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }

    }
       private int v;
   private ArrayList<Edge>graph[];

   Graph(int v){
       this.v=v;
       this.graph=new ArrayList[v];
       for(int i=0;i<v;i++){
           graph[i]= new ArrayList<>();
       }
   }

   public void addedges(int s,int d){
       Edge e = new Edge( s, d);
       graph[s].add(e);
   }

  public  void BFS(){
       boolean[] visted= new boolean[v];
      Queue<Integer> q = new LinkedList<>();
      for(int j=0;j<v;j++) {
          if (!visted[j]) {
              q.add(j);
              visted[j]=true;
              while (!q.isEmpty()) {
                  int curr = q.remove();

                      System.out.print(curr + " ");

                      for (int i = 0; i < graph[curr].size(); i++) {
                          Edge e = graph[curr].get(i);
                           if(!visted[e.dest]){
                               q.add(e.dest);
                               visted[e.dest]=true;
                           }

                      }

              }
          }
      }
  }



    public List<Integer> findSinglePath(int start, int end) {
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[v];
        boolean foundPath = false;
        findSinglePathHelper(start, end, path, visited, foundPath);
        return path;
    }

    private boolean findSinglePathHelper(int curr, int end, List<Integer> path, boolean[] visited, boolean foundPath) {

        if(curr == end){
            path.add(curr);
            foundPath = true;
            return true;
        }

        visited[curr] = true;
        path.add(curr);

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest] && !foundPath){
                if(findSinglePathHelper(e.dest, end, path, visited, foundPath)){
                    return true;
                }
            }
        }

        visited[curr] = false;
        path.remove(path.size()-1);
        return false;
    }

    public  void DFS(){
       boolean[] vis = new boolean[v];
       for(int i=0;i<v;i++){
           if(!vis[i]){
             DFShelper(i,vis);
           }
       }
  }

  public  void DFShelper(int curr, boolean[] vis){

      System.out.print(curr+"  ");
      vis[curr]=true;

      for(int i=0;i<graph[curr].size();i++){
          Edge e = graph[curr].get(i);
          if(!vis[e.dest]){
              DFShelper(e.dest,vis);
          }

      }
  }


//    public void findallpath(int start, int end) {
//        ArrayList<Integer> path = new ArrayList<>();
////        String path="";
//        boolean[] visited = new boolean[v];
//        findallpathHelper(start, end, path, visited);
//    }
//
//    private void findallpathHelper(int curr, int end, ArrayList<Integer> path, boolean[] visited) {
//
//        if (curr == end) {
//            System.out.println(path);
//            return;
//        }
//        for (int i = 0; i < graph[curr].size(); i++) {
//            Edge e = graph[curr].get(i);
//            if (!visited[e.dest]) {
//                visited[curr] = true;
//                path.add(e.dest);
//                findallpathHelper(e.dest, end, path, visited);
//                visited[curr] = false;
//            }
//        }
//    }

        public static void main (String[]args){
            Graph g = new Graph(7);
            g.addedges(0, 1);
            g.addedges(0, 2);
            g.addedges(1, 0);
            g.addedges(1, 3);
            g.addedges(2, 0);
            g.addedges(2, 4);
//        g.addedges(2,3);
//        g.addedges(2,1);
            g.addedges(3, 1);
            g.addedges(3, 4);
            g.addedges(3, 5);
            g.addedges(4, 2);
            g.addedges(4, 3);
            g.addedges(4, 5);
            g.addedges(5, 3);
            g.addedges(5, 4);
            g.addedges(5, 6);
//        g.addedges(2,1);

//        g.printGraph();
//        g.removeEdge(2,3);
//        g.removeEdge(2,4);
//        System.out.println();
//        g.printGraph();
            g.BFS();
            System.out.println();
            g.DFS();
            System.out.println(g.findSinglePath(3,5));

        }

        public void printGraph () {
            for (int i = 0; i < v; i++) {
                System.out.print(" vertex " + i + " :");
                for (Edge a : graph[i]) {
                    System.out.print("(" + a.src + "," + a.dest + ")");
                }
                System.out.println();
            }
        }

        public void removeEdge ( int src, int dest){
            for (int i = 0; i < graph[src].size(); i++) {
                if (graph[src].get(i).dest == dest) {
                    graph[src].remove(i);
                    break;
                }
            }
        }

    }

