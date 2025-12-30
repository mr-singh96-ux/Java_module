// Action-First Calculator

import java.util.Stack;

public class que5{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String st = "*34";

        for(int i = st.length()-1; i>=0; i--){
            char c = st.charAt(i);
            if(Character.isDigit(c)){
                s.push(c-'0');
            }else{
                int b = s.pop();
                int a = s.pop();
                switch(c){
                    case '+':
                    s.push(b+a);
                    break;
                    case '*':
                    s.push(b*a);
                    break;
                    case '-':
                    s.push(b-a);
                    break;
                    case '/':
                    s.push(b/a);
                    break;
                    case '^':
                    s.push((int)Math.pow(b,a));
                    break;
                }
            }
        }
        System.out.println(s.pop());
    }
}