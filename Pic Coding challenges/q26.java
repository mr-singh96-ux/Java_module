//Sum of non adjacant elemnets of arr

public class q26 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,2,5};
        int prev1 = 0;
        int prev2 = 0;
        for(int n : arr){
            int curr = Math.max(prev1, prev2+n);
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
    
}
