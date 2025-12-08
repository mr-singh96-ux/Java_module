//Prefix Evaluation
package CodingChallengesQues;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        String exp = "*-+5248";
        Stack<Integer> s = new Stack<>();
        for(int i = exp.length()-1; i>=0; i--){
            char c = exp.charAt(i);
            if(Character.isDigit(c)){
                s.push(c - '0');
            }
            else{
                int a = s.pop();
                int b = s.pop();
                switch(c){
                    case '+':
                    s.push(a+b);
                    break;
                    case '-':
                    s.push(a-b);
                    break;
                    case '*':
                    s.push(a*b);
                    break;
                    case '/':
                    s.push(a/b);
                    break;
                    case '^':
                    s.push((int)Math.pow(a, b));
                    break;
                }
            }
        }
        System.out.println(s.pop());
    }
}