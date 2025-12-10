//distinct value at given index
import java.util.*;
public class q14 {
    public static void main(String[] args) {
        int[] arr = {5, 5,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>();
        for(int n : arr){
            if(!v1.contains(n)){
                v1.add(n);
            }else{
                v2.add(n);
            }
        }

        for(int n : v2){
            if(v1.contains(n)){
                v1.remove(Integer.valueOf(n));
            }
        }

        if(k>0 && k<=v1.size()){
            System.out.println(v1.get(k-1));
        }else{
            System.out.println(0);
        }
        
    }
    
}
