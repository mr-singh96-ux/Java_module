import java.util.*;
public class search {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key;
        key = sc.nextInt();
        boolean found = false;
        for(int x: arr){
            if(x == key){
                found = true;
            }
        }
        if(found == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
