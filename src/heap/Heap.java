package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Heap {

   ArrayList<Integer> arr = new ArrayList<>();


    public  void addval(int data){
        arr.add(data);

        int x= arr.size()-1;
         int par = (x-1)/2;

         while(arr.get(x)<arr.get(par)){
             int temp = arr.get(x);
             arr.set(x,arr.get(par));
             arr.set(par,temp);
         }

    }
   public  void peek(){
        for(int i=0;i<arr.size();i++){
            int a = arr.get(i);
            System.out.println(a);
        }

   }
    public  void buildHeap(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }


    public  void heapify(ArrayList<Integer> arr, int idx, int n){
        int left = 2*idx+1;
        int right = 2*idx+2;
        int minIndx = idx;

        if(left<arr.size()&&arr.get(minIndx)>arr.get(left)){
            minIndx = left;
        }
        if(right<arr.size()&& arr.get(minIndx)>arr.get(right)){
            minIndx=right;
        }

        if(minIndx!=idx){
            Collections.swap(arr,minIndx,idx);
            heapify(arr,minIndx,n);
        }
   }
    public static void main(String[] args) {
        Heap heap = new Heap();
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        arr.add(7);
//        arr.add(2);
//        arr.add(1);
//        arr.add(6);
//        arr.add(8);
//        arr.add(5);
//        arr.add(3);
//        arr.add(4);

//        System.out.println("Before sorting:");
//        System.out.println(arr);
//        System.out.println();
//
//        heap.buildHeap(arr);
//        System.out.println(arr);

        heap.addval(7);
        heap.addval(2);
        heap.addval(1);
        heap.addval(6);
        heap.addval(8);
        heap.addval(5);
        heap.addval(3);
        heap.addval(4);
        heap.peek();
    }
}
