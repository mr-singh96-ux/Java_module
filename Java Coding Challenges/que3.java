//  Hex/Cleaning String 
// import java.util.*;
public class que3{
    public static void main(String[] args) {
        String s = "00560";
        StringBuilder sb = new StringBuilder();
        boolean val = true;

        for(char c : s.toCharArray()){
            if(c=='0' && val){
                continue;
            }
            val = false;
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}