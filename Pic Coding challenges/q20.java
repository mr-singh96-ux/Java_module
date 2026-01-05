//String generating machine
import java.util.*;
public class q20 {
    public static void main(String[] args) {
        String s = "abcdefghi";
        boolean gen = true;
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(HashMap.Entry<Character,Integer> e : freq.entrySet()){
            if(e.getValue()!=1){
                gen = false;
                break;
            }
        }
        if(gen){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    
}
