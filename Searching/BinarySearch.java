package Searching;
import java.util.*;
public class BinarySearch {
    public static int partition(int[] arr, int st, int end) {
        int i = st-1;
        int pivot = arr[end];
        for(int j=st; j<end; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }

    public static void quickSort(int[] arr, int st, int end){
        if(st<end){
            int pi = partition(arr, st, end);
            quickSort(arr, st, pi-1);
            quickSort(arr, pi+1, end);
        }
    }
    public static int BiSe(int[] arr, int n, int el){
        int st = 0;
        int end = n-1;
        while(st <= end){
        int mid = st + ((end-st)/2);
        if( el == arr[mid]){
            return mid;
        }
        else if(el > arr[mid]){
            st = mid+1; 
        } 
        else{
            end = mid - 1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = scan.nextInt();
    }
    quickSort(arr, 0, n-1);
    for(int c: arr){
        System.out.print(c+" ");
    }
    System.out.println();
    int el = scan.nextInt();
    int inx = BiSe(arr, n, el);
    if(inx != -1){
    System.out.println(inx + ": " + arr[inx]);
    } else {
    System.out.println("Element not found");
    }
    scan.close();
}    
}