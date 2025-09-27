import java.util.*;
public class matrixsum{
    public static void main(String[] args) {
        int r1,r2,c1,c2;
        Scanner sc = new Scanner(System.in);
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        if(r1==r2 && c1==c2){
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                m2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                m1[i][j] += m2[i][j];
            }
        }

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("Addition not possible!");
    }
    sc.close();
}
}