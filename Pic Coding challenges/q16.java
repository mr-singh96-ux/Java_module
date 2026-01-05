//CeaserCipher
// import java.util.*;
public class q16 {
    public static void main(String[] args) {
        String s = "Attack Zerg At Down";
        StringBuilder sb = new StringBuilder();
        s = s.toUpperCase();
        int key = 3;
        for(char c : s.toCharArray()){
            
            if(c>='A' && c<='Z'){
                char nChar = (char)(c+key);
                if(nChar>'Z'){
                    nChar =(char) (nChar-26);
                }
                if(nChar<'A'){
                    nChar = (char)(nChar+26);
                }sb.append(nChar);
            }
            else sb.append(c);
        }
        System.out.println(sb);
    }
}
