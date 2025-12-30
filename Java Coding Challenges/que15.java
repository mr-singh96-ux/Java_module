//  Array Operation (Apply Move) 
// Statement: Shift all non-zero elements to the front while maintaining their relative order.

import java.util.*;

public class que15{
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] newA = new int[arr.length];

        int i = 0;
        for(int n : arr){
            if(n!=0){
            newA[i] = n;
            i++;
            }
            
        }

        System.out.println(Arrays.toString(newA));
    }
}