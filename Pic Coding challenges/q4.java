//Airport Mishap
public class q4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3,4};

        int xor = 0;
        for(int n : arr1){
            xor ^= n;
        }

        for(int n : arr2){
            xor ^= n;
        }

        System.out.println(xor);
    }
    
}
