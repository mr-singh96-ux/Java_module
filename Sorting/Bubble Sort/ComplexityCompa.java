public class ComplexityCompa {
    public static int[] BubbleSort(int[] arr, int n){
        int swaps = 0;
        int iterations = 0;
        int comp = 0;
        for(int i=0; i<n-1; i++){
            iterations++;
            for(int j=0; j<n-1-i; j++){
                comp++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }
        return new int[]{iterations, swaps, comp};
    }
    public static void main(String[] args) {
        // int[] arr = {5, 2, 3, 1, 6};
         int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        int[] result = BubbleSort(arr, n);
        System.out.println("Iterations: " + result[0]);
        System.out.println("Swaps: " + result[1]);
        System.out.println("Comparisons: " + result[2]);
        
        if(result[0] == n-1 && result[1] == 0) System.out.println("Best Case: O(n)");
        else if(result[1] == result[2]) System.out.println("Worst Case: O(n^2)");
        else{ System.out.println("Average Case: O(n^2)");}
    }
}
