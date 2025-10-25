public class Sort{
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1); //left half
            quickSort(arr, pi+1, high); //right half
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int c: arr){
            System.out.print(c+" ");
        }
    }
}