package binarySearch;

public class BinarySrearchRecutsion {

    public  int binarySerach(int[] arr,int k,int first,int last){

     if(first>=last){
         return -1;
     }


//        while(first<=last) {
            int mid =first+(last-first)/2;

            if (k == arr[mid]) {
                return mid;
            }

            if (k < arr[mid]) {
               return binarySerach(arr,k,0,mid);

            } else if (k > arr[mid]) {

               return binarySerach(arr,k,mid+1,arr.length-1);

            }
            return -1;
        }

    public static void main(String args[])
    {
        BinarySrearchRecutsion ob = new  BinarySrearchRecutsion();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 20;
        int result = ob.binarySerach(arr,x,0,arr.length-1);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }


}
