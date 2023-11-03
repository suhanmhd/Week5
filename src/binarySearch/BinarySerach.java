package binarySearch;

public class BinarySerach {
    public  int binarySerach(int[] arr,int k){
        int first =0;
        int last=arr.length-1;



        while(first<=last) {
            int mid =first+(last-first)/2;

            if (k == arr[mid]) {
                return mid;
            }

            if (k < arr[mid]) {
                last = mid;
            } else if (k > arr[mid]) {
                first = mid + 1;

            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        BinarySerach ob = new BinarySerach();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 40;
        int result = ob.binarySerach(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}
