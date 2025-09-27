import java.util.*;
public class averagemark {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        System.out.println(sum/n);
    }
}
