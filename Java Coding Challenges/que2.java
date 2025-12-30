//Airline Baggage
import java.util.*;
public class que2 {
    public static void main(String[] args) {
        // Vector<Integer> v1 = new Vector<>();
        
        int[] arr = {101,102,101,103,102};

        // for(int n : arr){
        //     if(!v1.contains(n)){
        //         v1.add(n);
        //     }
        // }

        // System.out.println(v1.size());

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n : arr){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }

        System.out.println(freq.size());
        System.out.println(freq);
    }
}
