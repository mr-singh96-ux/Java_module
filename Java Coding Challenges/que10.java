// K Challenges For Last Occurrence

import java.util.*;

public class que10{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int[] arr = {3,5,1};
        int[] arr1 = {6,5,5,4,2,2};
        for(int n : arr1){
            l.add(n);
        }

        int sumIndex =0;

        for(int n : arr){
            int i = l.lastIndexOf(n);
            if(i != -1) sumIndex += i;
        }

        System.out.println(sumIndex);
    }
}