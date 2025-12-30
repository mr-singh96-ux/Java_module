//max sum of non adjacent elements in an array
import java.util.*;
public class q16 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,5};
        int[] result = new int[arr.length];

        if(arr.length==0){
            System.out.println("0");
            return;
        }

        result[0] = arr[0];
        if(arr.length>1){
            result[1] = Math.max(arr[0], arr[1]);
        }

        for(int i=2; i<arr.length; i++){
            result[i] = Math.max(result[i-1], result[i-2]+arr[i]);
        }

        System.out.println(result[arr.length-1]);
    }
    
}
