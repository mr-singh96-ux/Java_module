// 2️⃣ Check if Two Strings are Anagrams (without sorting)

// Use frequency counting instead of sorting.
// Example: "listen", "silent" → true

import java.util.*;
public class q2 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAna = true;
        if(str1.length() != str2.length()) isAna = false;

        Vector<Character> c1 = new Vector<>();
        Vector<Character> c2 = new Vector<>();
        for(char c : str1.toCharArray()){
            c1.add(c);
        }

        for(char c : str2.toCharArray()){
            c2.add(c);
        }

        for(char c : c1){
        if(c2.contains(c)){
            // isAna = false;
            c2.remove((Character) c);
        }
        else{
            isAna = false;
            break;
        }
    }

    if (!c2.isEmpty()) {
        isAna = false;
    }
    
    System.out.println(isAna);
    }
}