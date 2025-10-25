public class Sort{
    public static void main(String[] args) {
        int[] arr={1,5,4,3,2};
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}