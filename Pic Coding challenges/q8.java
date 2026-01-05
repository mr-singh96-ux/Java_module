//Genetic sequence reporter

// import java.util.HashMap;

public class q8 {
    public static void main(String[] args) {
        String s = "aabbccdef";
        java.util.LinkedHashMap<Character, Integer> freq = new java.util.LinkedHashMap<>();

        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for(java.util.HashMap.Entry<Character,Integer> e : freq.entrySet()){
            if(e.getValue()>1){
                sb.append(e.getKey());
                sb.append(e.getValue());
            }
            else{
                sb.append(e.getKey());
            }
        }

        System.out.println(sb);
    }
    
}
