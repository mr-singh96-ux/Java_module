// Cipher
import java.util.*;
public class q13 {
    public static void main(String[] args) {
        String str = "DWWDFN DW CHUJ GRZQ";
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c>='a' && c<='z'){
                char new1 = (char)(c+k);
            if(new1>'z'){
                new1=(char)(new1-26);
            }
            if(new1<'a'){
                new1=(char)(new1+26);
            }
                 sb.append(new1);
            }
            else sb.append(c);
        }
        System.out.println(sb.toString().toUpperCase());
    }
}
