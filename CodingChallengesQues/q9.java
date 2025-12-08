//Two adjacent characters
import java.util.*; 
// package CodingChallengesQues;

public class q9 {
    public static void main(String[] args) {
        String word = "aabbccddeeff";
        int changes = 0;
        char prev = word.charAt(0);
        for(int i=1;i<word.length();i++){
            char curr = word.charAt(i);
            if(curr==prev){
                changes++;
                prev='#';
            }else{
                prev=curr;
            }
        }
        System.out.println(changes);
    }
    
}
