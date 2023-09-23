package Array;

import java.util.Arrays;

public class Kthsmallest {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int n = arr.length;
        arr = new int[]{7, 10, 4, 3, 20, 15};
    int k=3;
    Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
