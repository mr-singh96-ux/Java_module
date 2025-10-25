import java.util.*;
public class sort{

public static void merge(int[] arr, int st, int mid, int end){
    Vector<Integer> temp = new Vector<>();
    int i = st;
    int j = mid+1;
    while(i <= mid && j <= end){
        if(arr[i] <= arr[j]){
            temp.add(arr[i]);
            i++;
        }
        else{
            temp.add(arr[j]);
            j++;
        }
    }
    while(i <= mid){
        temp.add(arr[i]);
        i++;
    }
    while(j <= end){
        temp.add(arr[j]);
        j++;   
    }
    for(int inx=0; inx<temp.size(); inx++){
        arr[inx+st] = temp.get(inx);
    }
}

public static void mergesort(int[] arr, int st, int end){
    if(st < end){
    int mid = st + ((end-st)/2);
    mergesort(arr, st, mid); //left
    mergesort(arr, mid+1, end); //right
    merge(arr, st, mid, end);
    }
}
    public static void main(String[] args) {
        int[] arr = {5,6,1,3,2,4};
        int n = arr.length;
        mergesort(arr, 0, n-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}