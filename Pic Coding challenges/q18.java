//Ticket queue problem
import java.util.*;
public class q18 {
    public static void main(String[] args) {
        int[] arr = {6,11,4,11,9,4};
        int k = 2;
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for(int n : arr){
            freq.put(n, freq.getOrDefault(n,0)+1);
        }

        ArrayList<Integer> l = new ArrayList<>();
        for(HashMap.Entry<Integer,Integer> e : freq.entrySet()){
            if(e.getValue()==1){
                l.add(e.getKey());
            }
        }

        if(k>l.size()){
            System.out.println("0");
        }else{
            System.out.println(l.get(k-1));
        }
    }
}
