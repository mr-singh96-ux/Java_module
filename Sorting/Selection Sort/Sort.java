public class Sort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4, 1};
        int n = arr.length;
        int iterations = 0, swaps = 0, comp=0;
        for(int i=0; i<n-1; i++){
            int min_index = i;
            iterations++;
            for(int j=i+1; j<n; j++){
                comp++;
                if(arr[j] > arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index!=i){
                swaps++;
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        System.out.println("Swaps: "+ swaps);
        System.out.println("Iterations: " + iterations);
        System.out.println("Comparisons: " + comp);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }    
}
