//Duplicate flyers
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,5,6,2,3,4};
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList <Integer> l = new ArrayList<>();
        for(int n : arr){
            freq.put(n,freq.getOrDefault(n, 0)+1);
        }

        for(HashMap.Entry<Integer, Integer> e : freq.entrySet()){
            if(e.getValue() > 1){
                l.add(e.getKey());
            }
        }

        for(int n : l){
            System.out.print(n+" ");
        }
    }
    
}
