// Change letters to save friend
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        String s = "heelloo";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : set){
            sb.append(c);
        }

        System.out.println(sb);
    }
    
}
