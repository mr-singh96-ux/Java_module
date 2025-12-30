// String Compression 

import java.util.*;

public class que23{
    public static void main(String[] args) {
        String s = "ababa";
        HashMap<Character,Integer> freq = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> e : freq.entrySet()){
            if(e.getValue()>1){
                sb.append(e.getKey());
                sb.append(e.getValue());
            }else{
                sb.append(e.getKey());
            }
        }

        System.out.println(sb.toString());
    }
}