import java.util.*;
public class rev {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for( int i = n - 1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
    sc.close();
    }
}
