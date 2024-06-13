//package samples;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Fibanocci {
//    public static int fibanocciSeries(int n){
//
//        if (n < 0){
//
//            return 1;
//        }
//
//         int a =  fibanocciSeries(n-1);
//        int b = fibanocciSeries(n -2);
//        System.out.println( a+b);
//        return  a + b;
////        System.out.println(b);
//
//
//
//
//    }
//
//  public static void findMissingNumbers(){
//
//        int[] arr = {1,2,4,5};
//      int n = arr.length;
//      n= n-1;
//        int sum = 0;
//        int c = 0;
//        for (int i = 0;i<n; i++) {
//            c++;
//            if(c!= arr[i]){
//                System.out.println(c);
//            }
//
//        }
//
//        public static boolean findCycleInGraph()  {
//
//          ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//          int v = 5;
//
//          cycleHelper(list,v);
//      }
//
//
////      System.out.println( n* (n+1)/2 - (sum));
//
//
//
//
//
//
//
//
//      System.out.println("the missing value is:"+ c);
//
//
//
//   }
//
//    private static boolean cycleHelper(ArrayList<ArrayList<Integer>> list, int v) {
//
//        int[] vis = new int[v];
//        Queue<Pair> queue = new LinkedList<>();
//        queue.offer(new Pair(0,-1));
//        vis[0]= 1;
//
//        while(!queue.isEmpty()) {
//            Pair pq = queue.poll();
//            int src = pq.src;
//            int par = pq.par;
//
//            for (int i =0;i<list.get(src).size();i++) {
//                  int newdestination = list.get(src).get(i);
//
//
//                   if(vis[newdestination]==0) {
//                    queue.offer(new Pair(newdestination,src))  ;
//                   }
//                   else if(vis[newdestination]==1 &&  par!= newdestination ){
//                       return false;
//                   }
//
//            }
//            return  true;
//
//
//        }
//
//
//
//    }
//
//
//    public static void main(String[] args) {
//       findMissingNumbers();
////      int result =  fibanocciSeries(3);
////        System.out.println(result);
//    }
//}
//
//class Pair{
//    int src;
//    int par;
//
//    Pair(int src,int par){
//        this.src =src;
//        this.dest =par;
//    }
//}
