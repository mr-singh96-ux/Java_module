//Frequency of alpha in string greater than 2
package CodingChallengesQues;
import java.util.*;
public class q7 {
    public static void main(String[] args) {
        String str = "abddddddd";
        Vector<Character> ch = new Vector<>();
        Vector<Integer> v = new Vector<>();
        for(char c : str.toCharArray()){
            if(!ch.contains(c)){
                ch.add(c);
                v.add(1);
            }else{
                int index = ch.indexOf(c);
                v.set(index, v.get(index)+1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<ch.size(); i++){
            sb.append(ch.get(i));
            if(v.get(i)>1){
                sb.append(v.get(i));
            }
        }

        System.out.println(sb.toString());
    }
}
