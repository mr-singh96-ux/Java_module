//Family Photograph
public class q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        for(int i=0;i<arr.length;i+=k){
            int left = i;
            int right = Math.min(i+k-1, arr.length-1);
            // if(right>=arr.length) break;
            while(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            
        }
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
    
}
