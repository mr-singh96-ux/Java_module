//Validate string
import java.util.*;
public class q25 {
    public static void main(String[] args) {
        String s = "abc@123";
        char c = s.charAt(0);
        boolean val = true;
        
        if(!Character.isAlphabetic(c)){
            System.out.println("No");
            return;
        }


        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch) && !Character.isAlphabetic(ch)){
                val = false;
                break;
            }
        }

        if(val){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    
}
