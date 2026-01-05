//PostFix
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        String s = "23*54*+9-";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                st.push(c-'0');
            }else{
                int b = st.pop();
                int a = st.pop();
                switch(c){
                    case '+':
                        st.push(a+b);
                        break;
                    case '-':
                         st.push(a-b);
                        break;
                    case '*':
                        st.push(a*b);
                        break;
                    case '/':
                         st.push(a/b);
                        break;
                    case '^':
                        st.push((int)Math.pow(a, b));
                        break;
                }
            }
        }

        System.out.println(st.pop());
        }
}
