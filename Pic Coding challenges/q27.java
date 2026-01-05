//Forest Research
import java.util.*;
public class q27 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {3,2,2,1,1,4,4,4,1,1};
        for(int x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for(HashMap.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()%2!=0){
                System.out.println(e.getKey());
            }
        }
    }
    
}
