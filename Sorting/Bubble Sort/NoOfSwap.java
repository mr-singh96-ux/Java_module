// import java.util.*;
public class NoOfSwap{
    public static void BubbleSort(int[] arr, int n){
        int swap = 0;
        
        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                    swap++;
                }
            }
            if(!swapped) break;
        }
        System.out.println("Swapping: "+swap);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr = {3, 5, 4, 8, 2};
        int n = arr.length;
    BubbleSort(arr, n);
        // sc.close();
}
    
}