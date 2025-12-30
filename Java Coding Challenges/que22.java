//  Code Braces Balance 
import java.util.*;
public class que22{
    public static void main(String[] args) {
        String a = "{[()]}";
        Stack<Character> s = new Stack<>();
        boolean bal = true;
        for(char c : a.toCharArray()){
            if(c=='{'||c=='['||c=='('){
                s.push(c);
            }
            else{
                if(s.isEmpty()){
                    bal = false;
                    break;
                }
            
            char top = s.pop();
            if((c=='}' && top!='{') || (c==')' && top!='(') || (c==']' && top!='[')){
                    bal = false;
                    break;
            }
        }
        }
        if(!s.isEmpty()) bal = false;
        if(bal) System.out.println("Balanced");
        else System.out.println("Not");
    }
}