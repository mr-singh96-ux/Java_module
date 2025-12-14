// balanced parenthesis
import java.util.*;
// package CodingChallengesQues;

public class q10 {
    public static void main(String[] args) {
        String str = "a+(b*c)-{d/[e+f]}";
        Stack <Character> s = new Stack<>();
        boolean bal = true;
        for(char c : str.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                s.push(c);
            }
            else if(c==')'||c==']'||c=='}'){
                if(s.isEmpty()) {
                    bal = false;
                    break;
                }
                char ch = s.pop();
                if((c==')'&&ch!='(')||(c==']'&&ch!='[')||(c=='}'&&ch!='{')){
                    bal = false;
                    break;
                }
            }
            else{
                continue;
            }
        }
        if(!s.isEmpty()) bal = false;
        System.out.println(bal);
    }
}
