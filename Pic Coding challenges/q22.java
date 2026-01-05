//Count totaol reward points
import java.util.*;
public class q22 {
    public static void main(String[] args) {
        int num = 928;
        String s = String.valueOf(num);
        int count = 0;
        for(char c : s.toCharArray()){
            if(c=='1'||c=='2'||c=='3'||c=='5'||c=='7'){
                count += 0;
            }
            else if(c=='4'||c=='9'||c=='0'||c=='6') count+=1;
            else if(c=='8') count+=2;
        }
        System.out.println(count);;
    }
    
}
