//Balanced Parenthesis
import java.util.*;
public class q13{
    public static void main(String[] args) {
        String s = "if(arr(4)>9){foo(arr[2]);}";
        Stack<Character> st = new Stack<>();
        boolean balanced = true;
        for(char c : s.toCharArray()){
            if(c=='{'||c=='['||c=='('){
                st.push(c);
            }
            else if(c=='}'||c==']'||c==')'){
                if(st.isEmpty()){
                balanced = false;
                break;
                }

                char ch = st.pop();
                if((c==')'&&ch!='(')||(c==']'&&ch!='[')||(c=='}'&&ch!='{')){
                    balanced = false;
                    break;
                }
            }
        }
        if(!st.isEmpty()){
            balanced = false;
            // break;
        }
        System.out.println(balanced);
    }
}