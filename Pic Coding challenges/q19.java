//College Placement ids
import java.util.*;
public class q19 {
    public static void main(String[] args) {
        int[] arr = {10,101,12,13,11,102,25};
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr){
            set.add(n);
        }

        int maxLen = 1;
        for(int n : set){
            if(!set.contains(n-1)){
            int curr = n;
            int len = 1;
            while(set.contains(curr+1)){
                curr++;
                len++;
            }
            if(len > maxLen){
                maxLen = len;
            }
        }
        }
        System.out.println(maxLen);
    }
    
}
