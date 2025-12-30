// Botanical Garden (Maximize Sum)

import java.util.*;

public class que11{
    public static void main(String[] args) {
        int[] arr = {-5, -2, -3, -4};
        Vector<Integer> v = new Vector<>();

        for(int i =0; i<arr.length-1; i++){
            v.add(arr[i]);
        }
        Collections.sort(v);

        int sum = arr[arr.length-1] + v.get(v.size()-1);
        System.out.println(sum);
    }
}