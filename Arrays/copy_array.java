import java.util.*;
public class copy_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        // int arr2[];
        Scanner sc = new Scanner(System.in);
        int arr2[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        } 
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr2[i] + " ");
        } 
    }   
}
