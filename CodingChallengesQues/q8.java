//next smallest
import java.util.*;
public class q8 {
    public static void main(String[] args) {
        int[] arr = {20,10,15,50,40};
        int[] result = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i =arr.length-1;i>=0; i--){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()) result[i] = -1;
            else result[i] = s.peek();
            s.push(arr[i]);
        }

        System.out.println(Arrays.toString(result));
    }
}
