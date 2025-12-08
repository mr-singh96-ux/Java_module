//Postfix evaluation
package CodingChallengesQues;
import java.util.*;

public class q3 {
    public static void main(String[] args) {
        String s = "8425+-*";
        Stack<Integer> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                st.push(c-'0');
            }else{
                int a = st.pop();
                int b = st.pop();
                switch(c){
                    case '+':
                    st.push(b+a);
                    break;

                    case '-':
                    st.push(b-a);
                    break;

                    case '*':
                    st.push(b*a);
                    break;

                    case '/':
                    st.push(b/a);
                    break;

                    case '^':
                    st.push((int)Math.pow(a, b));
                    break;
                }
            }
        }
        System.out.println("Result: " + st.pop());
    }
}
