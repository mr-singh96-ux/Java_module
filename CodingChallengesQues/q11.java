// Your task is to determine whether there exists any row in the cinema hall that contains at least k consecutive empty seats.
// Return true if such a row exists, otherwise return false.

// Example 1:
// Input:
// seats = [
//   [1, 0, 0, 0, 1],
//   [0, 0, 1, 0, 0],
//   [1, 1, 1, 1, 1]
// ]
// k = 3

// Output: true

import java.util.*;
// package CodingChallengesQues;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j= 0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean found = false;
        int k = sc.nextInt();
        for(int i=0; i<r && !found; i++){
            int count = 0;
            for(int j=0; j<c; j++){
                if(arr[i][j]==0){
                    count++;
                } else if(arr[i][j]==1){
                    count = 0;
                }
                if(count==k){
                    System.out.println("Available "+(i+1)+" "+(j-count+2));
                    found = true;
                    break;
                }
            } 
        }
        if(!found){
            System.out.println("Not Available");
        }
    }
}
