// 1️⃣ Longest Substring Without Repeating Characters

// Given a string, find the length of the longest substring without repeating characters.
// Example: "abcabcbb" → 3 ("abc")

import java.util.*;

public class q1{
    public static void main(String[] args) {
        String str = "abcabcbb";
        Vector<Character> ch = new Vector<>();
        int left = 0;
        int maxLen=0;
        StringBuilder sb = new StringBuilder();
        for(int right = 0; right<str.length(); right++){
            char c = str.charAt(right);
            while(ch.contains(c)){
                ch.remove(0);
                left++;
            }
            ch.add(c);
            if(ch.size()>maxLen){
                maxLen = ch.size();
                sb = new StringBuilder();
                for(char c1 : ch){
            sb.append(c1);
        }
            }
        }       
              

        System.out.println("Longest SubString: "+sb.toString());
        System.out.println("Length: "+maxLen);
    }
}