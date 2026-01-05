//Total search time

import java.util.ArrayList;

public class q7 {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1,7,6,5};
        int[] arr2 = {1,7,0};
        ArrayList<Integer> l1 = new ArrayList<>();
        int sum = 0;

        for(int n : arr1){
            l1.add(n);
        }

        for(int n : arr2){
            if(l1.contains(n)){
                sum += l1.indexOf(n);
            }
            if(!l1.contains(n)){
                sum -= 1;
            }
        }

        System.out.println(sum);
    }
    
}
