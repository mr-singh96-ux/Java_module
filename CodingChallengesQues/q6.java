//Remove K Digits
package CodingChallengesQues;
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        String num = "10200";
        int k  = 3;
        Stack<Character> s = new Stack<>();
        for(char c : num.toCharArray()){
            while(!s.isEmpty() && k>0 && s.peek() > c){
                s.pop();
                k--;
            }
            s.push(c);
        }
        while(k>0){
            s.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : s){
            sb.append(c);
        }
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.length()==0) System.out.println("0");
        else System.out.println(sb.toString());
    }
}
