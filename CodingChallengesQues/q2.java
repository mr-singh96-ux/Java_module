//Duplicate string in an array

package CodingChallengesQues;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        Vector<String> v = new Vector<>();
        String[] s = {"abcde", "xyz", "abcd", "abcde", "qwerty"};
        for(String ch : s){
            if(!vec.contains(ch)){
                vec.add(ch);
            }else{
                v.add(ch);
            }
        }
        for(String ch : v){
            System.out.println("Duplicate: "+ch);
        }
    }
    
}
