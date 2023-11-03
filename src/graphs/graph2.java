//package graphs;
//
//import java.util.ArrayList;
//
//public class graph2 {
//
//    class  Edges{
//        int src;
//        int dest;
//
//        Edges(int src, int dest){
//            this.src=src;
//            this.dest=dest;
//        }
//    }
//    private  int v;
//    private  ArrayList<Edges>graph[];
//
//    graph2(int v){
//        this.v=v;
//        this.graph = new ArrayList[v];
//
//        for(int i=0;i<v;i++){
//            graph[i] = new ArrayList<>();
//
//        }
//    }
//
//    public void addelements(int src,int dest){
//
//
//            Edges e = new Edges(src,dest);
//                graph[src].add(e);
//
//        }
//
//    }
//
//    public  void prints(){
//    for(int i=0;i<v;i++){
//        System.out.print("vertex"+i+":");
//        for(Edges e:graph[i]){
//            System.out.println("("+e.src+"  "+e.dest+")");
//        }
//    }
//
//    }
//
//    public static void main(String[] args) {
//        graph2 obj = new graph2(4);
//        obj.addelements(0,1);
//        obj.addelements(0,3);
//        obj.addelements(1,2);
//        obj.addelements(2,3);
//        obj.prints();
//    }
//
//}
