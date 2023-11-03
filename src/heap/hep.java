package heap;

import java.util.ArrayList;
import java.util.Collections;

public class hep {

    public void addElement(ArrayList<Integer>arr, int data){
        arr.add(data);
        int n = arr.size()-1;
       int parent = (n-1)/2;

        while (arr.get(n)>arr.get(parent)){
            Collections.swap(arr,n,parent);
            n=parent;
            parent =(n-1)/2;
        }
        System.out.println(arr);
    }


    public  void buildHeap(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i=(n/2)-1;i>=0;i--) {
            heapify(arr, i, n);
        }
    }








    public  void heapify(ArrayList<Integer>arr,int idx,int n){
        int left =2*idx+1;
        int right = 2*idx+2;
        int midIdx = idx;


        if(left< arr.size()&&arr.get(left)> arr.get(midIdx)){
            midIdx = left;
        }
        if(right< arr.size()&&arr.get(right)> arr.get(midIdx)){
            midIdx =right;
        }

        if(midIdx!=idx){
            Collections.swap(arr,midIdx,idx);
            heapify(arr,midIdx,n);
        }
    }

    public  void remove(ArrayList<Integer>arr){
        int n = arr.size();
              arr.set(0,arr.get(n-1));
              arr.remove(n-1);

              heapify(arr,0,n);


    }
    public  void heapSort(ArrayList arr){
        int n =arr.size();

        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,i,n);
        }

        for(int i=n-1;i>=0;i--){
            Collections.swap(arr,0,i);
            heapify(arr,0,i);

        }
    }

    public static void main(String[] args) {
        hep h = new hep();
        ArrayList<Integer>arr =new ArrayList<Integer>();
//        arr.add(7);
//        arr.add(2);
//        arr.add(19);
//        arr.add(6);
//        arr.add(8);
//        System.out.println(arr);
//        h.buildHeap(arr);
//        System.out.println(arr);
        h.addElement(arr,1);
        System.out.println();
        h.addElement(arr,3);
        h.addElement(arr,4);
        h.addElement(arr,8);
//        h.remove(arr);
//        System.out.println(arr);
//        h.heapSort(arr);
//        System.out.println(arr);
//        h.remove(arr);
//        System.out.println(arr);

    }

}
