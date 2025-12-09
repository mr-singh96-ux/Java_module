//Baseball Score Calculation

import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String exp = "52C2D+";

        for(char c :exp.toCharArray()){
            if(Character.isDigit(c)){
                s.push(c-'0');
            }else{
                if(c=='C'){
                    s.pop();
                }
                else if(c=='D'){
                    s.push(s.peek()*2);
                }
                else if(c=='+'){
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b);
                    s.push(a);
                    s.push(a+b);
                }
            }
        }
        int sum = 0;
        for(int n : s){
            sum += n;
        }
        System.out.println(sum);
    }
    
}
