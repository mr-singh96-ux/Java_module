//Find K-th Rotation
public class que12{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // int swaps= 0;
        int n = arr.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1; j<n-i-1; j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             swaps++;
        //         }
        //     }
        // }

        int min = arr[0];
        int minI = 0;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
                minI = i;
            }
        }

        System.out.println(minI);
    }
}