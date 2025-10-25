import java.util.*;

class floatsum{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        float[] marks = new float[n];
        for(int i=0; i<n; i++){
            marks[i] = sc.nextFloat();
        }
        float sums = 0;
        for(float x : marks){
            sums += x;
        }
        System.out.println(sums);
        sc.close();
    }
    
}