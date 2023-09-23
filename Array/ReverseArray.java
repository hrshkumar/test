package Array;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n= arr.length;
        reverserArray(arr ,0,n-1);
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr);
    }
//    static void reverserArray(int[] arr){
//        int n= arr.length;
//        for(int i=0;i<n/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }
//    recursive Function
        static void reverserArray(int []arr, int start,int end){
            if(start>end)return;
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverserArray(arr,start+1, end-1);
        }
    }

