//  Matrix Diagonals Sum

import java.util.*;

public class que9{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        int sum = 0;
        for(int i=0;i<n;i++){
                sum += arr[i][i];
                sum += arr[i][n-i-1];
        }

        if(n % 2 == 1){
            sum -= arr[n/2][n/2];
        }
        System.out.println(sum);
        scan.close();
    }
}