// 4️⃣ First Non-Repeating Character

// Return the first character that appears only once.
// Example: "swiss" → 'w'
import java.util.*;

public class q3 {
    public static void main(String[] args) {
        String str = "swiss";
        Vector<Character> ch = new Vector<>();
        Character c1 = null;
        for(char c : str.toCharArray()){
            ch.add(c);
        }

        for(char c : ch){
            if(ch.indexOf(c) == ch.lastIndexOf(c)){
                c1 = c;
                break;
            }
        }
        System.out.println(c1);
    }    
}
