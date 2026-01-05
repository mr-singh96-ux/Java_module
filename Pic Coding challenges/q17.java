//Count leaders in company
public class q17 {
    public static void main(String[] args) {
        int[] arr = {12,27,14,11,25,6,7};
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>max){
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}
