// Audit Function
import java.util.*;
public class que14{
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int n : arr){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }

        int maxF = 0;
        int maxK = 0;
        for(Map.Entry<Integer, Integer> e : freq.entrySet()){
            if(e.getValue() > maxF){
                maxF = e.getValue();
                maxK = e.getKey();
            }
        }

        System.out.println(maxK);
        System.out.println(maxF);
    }
}