//  Merge Two Sorted Arrays
import java.util.*;
public class que16{
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n+m];
        
        for(int i=0;i<n;i++){
            arr3[i] = arr1[i];
        }

        for(int i=0;i<m;i++){
            arr3[n+i] = arr2[i];
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}