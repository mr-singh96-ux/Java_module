//Remove Adjacent Duplicates
package CodingChallengesQues;
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c) st.pop();
            else st.push(c);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
