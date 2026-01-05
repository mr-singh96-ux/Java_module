//Baseball Game
import java.util.*;
public class q11 {
    public static void main(String[] args) {
        String s ="52C2D+";
        Stack<Integer> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                st.push(c-'0');
            }
            else if(c=='C' && !st.isEmpty()){
                st.pop();
            }
            else if(c=='D' && !st.isEmpty()){
                int a = st.peek();
                a = 2*a;
                st.push(a);
            }
            else if(c=='+' && st.size() >= 2){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
        }
        int sum = 0;
        for(int n : st){
            sum += n;
        }
        System.out.println(sum);
    }
}
